package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Component
public class InterceptorConfig extends WebMvcConfigurationSupport{

		@Autowired
		Interceptor intercept;

		@Override
		protected void addInterceptors(InterceptorRegistry registry) {
			
			registry.addInterceptor(intercept);
		}		
}
