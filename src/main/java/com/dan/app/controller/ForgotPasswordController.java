package com.dan.app.controller;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dan.app.model.Usuario;
import com.dan.app.serviceInterface.UsuarioServicioImpl;
import com.dan.app.utilities.Utility;

import net.bytebuddy.utility.RandomString;

@Controller
public class ForgotPasswordController {

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private UsuarioServicioImpl usuarioServicioImpl;

	@GetMapping("/forgot_password")
	public String showForgotPasswordForm() {
		return "pages/forgot_password_form";
	}

	public void sendEmail(String recipientEmail, String link)
	        throws MessagingException, UnsupportedEncodingException {
	    MimeMessage message = mailSender.createMimeMessage();              
	    MimeMessageHelper helper = new MimeMessageHelper(message);
	     
	    helper.setFrom("DysSystemSupport.com", "Dys Soporte");
	    helper.setTo(recipientEmail);
	     
	    String subject = "Aquí está el enlace para restablecer su contraseña";
	     
	    String content = "<p>Hola, </p>"
	            + "<p>Ha solicitado restablecer su contraseña.</p>"
	            + "<p>Haga clic en el siguiente enlace para cambiar su contraseña:</p>"
	            + "<p><a href=\"" + link + "\">cambiar mi contraseña</a></p>"
	            + "<br>"
	            + "<p>\r\n"
	            + "Ignore este correo electrónico si recuerda su contraseña, "
	            + "\r\n"
	            + "o no ha realizado la solicitud.</p>";
	     
	    helper.setSubject(subject);
	     
	    helper.setText(content, true);
	     
	    mailSender.send(message);
	}

	@GetMapping("/reset_password")
	public String showResetPasswordForm(@Param(value = "token") String token, Model model) {
	    Usuario usuario = usuarioServicioImpl.getByResetPasswordToken(token);
	    model.addAttribute("token", token);
	     
	    if (usuario == null) {
	        model.addAttribute("message", "Invalid Token");
	        return "message";
	    }
	     
	    return "pages/reset_password_form";
	}

	@PostMapping("/reset_password")
	public String processResetPassword(HttpServletRequest request, Model model) {
	    String token = request.getParameter("token");
	    String password = request.getParameter("password");
	     
	    Usuario usuario = usuarioServicioImpl.getByResetPasswordToken(token);
	    model.addAttribute("title", "Reset your password");
	     
	    if (usuario == null) {
	        model.addAttribute("message", "Invalid Token");
	        return "message";
	    } else {           
	    	usuarioServicioImpl.updatePassword(usuario, password);
	         
	        model.addAttribute("message", "You have successfully changed your password.");
	    }
	     
	    return "pages/message";
	}
	
	@PostMapping("/forgot_password")
	public String processForgotPassword(HttpServletRequest request, Model model) {
	    String email = request.getParameter("email");
	    String token = RandomString.make(30);
	     
	    try {
	    	usuarioServicioImpl.updateResetPasswordToken(token, email);
	        String resetPasswordLink = Utility.getSiteURL(request) + "/reset_password?token=" + token;
	        sendEmail(email, resetPasswordLink);
	        model.addAttribute("message", "Hemos enviado un enlace para restablecer la contraseña a su correo electrónico. Por favor, compruebe.\r\n"
	        		+ "");
	         
	    } catch (UsernameNotFoundException ex) {
	        model.addAttribute("error", ex.getMessage());
	    } catch (UnsupportedEncodingException | MessagingException e) {
	        model.addAttribute("error", "\r\n"
	        		+ "Error al enviar correo electrónico");
	    }
	         
	    return "pages/forgot_password_form";
	}
}
