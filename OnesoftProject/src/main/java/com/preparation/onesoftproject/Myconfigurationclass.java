package com.preparation.onesoftproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
 
@EnableWebSecurity
@Configuration
public class Myconfigurationclass extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("kathir")
				.password("$2a$10$hwlhHZZ6YAITv.guZPX2y.eNdsSWW56ZTXN9f1GoNUBkxPGVabzw2").roles("students").and()
				.withUser("nisha").password("$2a$10$5anMybJ56WGzM6jJJXXX1uS.ly.KxaCaXP883fbciyduYbO7ju08i")
				.roles("trainers").and().withUser("prakash")
				.password("$2a$10$y2Tj1BF3GCZcgLUqI.OJku..XCxosvlJPPPX6S11/rtUkqU0En0uW").roles("manager");
	}

//	@Bean
//	public PasswordEncoder getPassword() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	@Bean
	public PasswordEncoder getThisPassword() {
		return new BCryptPasswordEncoder(10);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/manager").hasRole("manager");
		http.authorizeRequests().antMatchers("/trainers").hasAnyRole("manager", "trainers");
		http.authorizeRequests().antMatchers("/students").permitAll().and().formLogin();
	}
}
