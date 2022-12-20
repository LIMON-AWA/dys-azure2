package com.dan.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.dan.app.serviceInterface.UsuarioServicio;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	String[] resources = new String[]{
            "/include/**","/css/**","/icons/**","/img/**","/js/**","/layer/**","/static/**","/vendor/**","/images/**","images//"
    };
	
	@Autowired
	private UsuarioServicio usuarioServicio;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(usuarioServicio);
		auth.setPasswordEncoder(passwordEncoder());
		return auth;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
		.antMatchers(resources).permitAll()  
		.antMatchers(
				"/registro**",
				"/js/**",
				"/css/**",
				"/img/**",
				"/vendor/**",
				"/images/**",
				"images//").permitAll()
		.antMatchers("/","/index").permitAll()
		.antMatchers("/home").permitAll()
		.antMatchers("/usuario/home").permitAll()
		.antMatchers("/pages/contacto").permitAll()
		.antMatchers("/pages/Nosotros").permitAll()
		.antMatchers("/pages/Chat").permitAll()
		.antMatchers("/Productos").permitAll()
		.antMatchers("/pages/login").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/pages/Dashboard")
		.permitAll()
		.and()
		.logout()
		.logoutSuccessUrl("/?logout")
		.permitAll();
		 http.headers().frameOptions().sameOrigin().httpStrictTransportSecurity().disable();
	}
}






