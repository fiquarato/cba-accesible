package com.inclusion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ConfigurationGlobal {

	private static final String ALLOWED_MAPPING = "/**";
	private static final String ALLOWED_ORIGIN = "*";

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping(ALLOWED_MAPPING).allowedOrigins(ALLOWED_ORIGIN).allowedMethods("DELETE", "GET",
						"POST");
			}
		};
	}
}
