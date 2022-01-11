package com.consultadd.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
public class webSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("user1").password("password").roles("USER").and()
                .withUser("user2").password("sandeep").roles("USER2");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests().antMatchers("/**")
                .hasAnyRole("USER").and().formLogin();
    }
}
