package com.enola.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

import static org.springframework.web.servlet.function.RouterFunctions.*;

import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import com.enola.hello.config.dto.Message;

@Configuration
public class RouterConfig {
	@Bean
	public RouterFunction<ServerResponse> demo(){
		return route().GET("/router-demo",
				req -> ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(new Message("Hello","Hello from Router"))).build();


	
	}
}
