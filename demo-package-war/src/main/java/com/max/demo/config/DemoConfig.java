package com.max.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class DemoConfig implements WebMvcConfigurer{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
        	.addResourceHandler("/resources/css/**").addResourceLocations("classpath:/static/css/");
        registry
        	.addResourceHandler("/resources/image/**").addResourceLocations("classpath:/static/image/");
        registry
        	.addResourceHandler("/resources/js/**").addResourceLocations("classpath:/static/js/");
    }
}
