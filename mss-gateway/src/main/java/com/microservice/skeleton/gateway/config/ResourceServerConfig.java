package com.microservice.skeleton.gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.boot.autoconfigure.security.Http401AuthenticationEntryPoint;
/**
 * Created by Mr.Yangxiufeng on 2017/12/29.
 * Time:9:41
 * ProjectName:Mirco-Service-Skeleton
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.
                csrf().disable()
                .exceptionHandling()
                .authenticationEntryPoint(new Http401AuthenticationEntryPoint("Bearer realm=\"webrealm\""))
                .and()
                .authorizeRequests()
                .antMatchers("/uaa/*").permitAll()
               // .antMatchers("/hello").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic();

        //http.authorizeRequests().anyRequest().permitAll();
    }
}
