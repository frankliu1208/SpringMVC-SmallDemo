package com.bookstore.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.bookstore.controller", "com.bookstore.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
