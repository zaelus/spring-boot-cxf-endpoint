package org.fcap.example.cxfendpointtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	public static final String ROLE_ADMIN = "ADMIN";
	public static final String ROLE_USER = "USER";

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.csrf()
				.disable()
				.authorizeRequests()
				.antMatchers("/", "/soap-api").permitAll()
				.antMatchers("/admin/**").hasRole(ROLE_ADMIN)
				.anyRequest().authenticated()
				.and()
				.formLogin()
//				.loginPage("/login")
				.permitAll()
				.and()
				.logout()
					.logoutUrl("/do_logout")
					.logoutSuccessUrl("/login")
					.invalidateHttpSession(true)
				.permitAll()
		;
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user =
				User.withUsername("user")
						.password("password")
						.roles(ROLE_USER)
						.build();

		UserDetails admin =
				User.withUsername("admin")
						.password("password")
						.roles(ROLE_ADMIN)
						.build();

		return new InMemoryUserDetailsManager(Arrays.asList(user, admin));
	}
}
