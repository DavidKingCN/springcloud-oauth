package com.microservice.skeleton.gateway.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.boot.autoconfigure.security.Http401AuthenticationEntryPoint;
/**
 * Created by Mr.Yangxiufeng on 2017/12/29.
 * Time:10:08
 * ProjectName:Mirco-Service-Skeleton
 */
@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

//                http.
//                csrf().disable()
//                .exceptionHandling()
//                .authenticationEntryPoint(new Http401AuthenticationEntryPoint("Bearer realm=\"webrealm\""))
//                .and()
//                .authorizeRequests()
//                .antMatchers("/uaa/oauth/token").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
    }
}
