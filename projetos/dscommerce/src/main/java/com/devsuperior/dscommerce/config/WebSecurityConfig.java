package com.devsuperior.dscommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		//permite acesso a toda requisição
	http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
		//libera o acesso ao banco h2
	http.headers().frameOptions().disable();
		//libera a protecao csrf protege do racker
	http.csrf().disable();
	return http.build();
	}
}
