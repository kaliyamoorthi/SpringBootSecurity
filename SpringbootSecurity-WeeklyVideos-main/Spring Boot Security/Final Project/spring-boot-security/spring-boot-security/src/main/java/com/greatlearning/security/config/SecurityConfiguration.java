package com.greatlearning.security.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// By writing the below configuration, we are storing our in memory password
//		// using BCrypt, FYI: this is recommended for Prod env
//		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//		// In-memory authentication, method chaining
//		auth.inMemoryAuthentication().withUser("samarth").password(encoder.encode("samarth")).roles("STORE_OWNER").and()
//				.withUser("rohan").password(encoder.encode("rohan")).roles("STORE_CLERK");
//	}
//
//	// If you don't want to encode the created password, you can write the belowbean
//	// method, FYI: not recommended for Prod env
//
//	@Bean
//	PasswordEncoder getPasswordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/h2-console/**");
//
//	}
//}
