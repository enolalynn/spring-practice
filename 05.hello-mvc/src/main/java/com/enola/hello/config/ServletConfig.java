package com.enola.hello.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.function.EntityResponse;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.enola.hello.config.dto.Message;
import com.enola.hello.controller.LegacyController;
import com.enola.hello.controller.interceptor.HelloInterceptor;

@Configuration
@ImportResource(locations = "/WEB-INF/controllers.xml")
@EnableWebMvc
@ComponentScan("com.enola.hello.controller")
public class ServletConfig implements WebMvcConfigurer{
	@Autowired
	private HelloInterceptor helloInterceptor;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "/hello");
	}
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry){
		registry.jsp().prefix("/views/").suffix(".jsp");
	}
//	@Bean
//	public ViewResolver jspViewResolver() {
//		return new InternalResourceViewResolver("/views/",".jsp");
//				
//	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(helloInterceptor);
	}
	
//	@Bean("/legacy")
//	public LegacyController legacyController(){
//		return new LegacyController();
//		
//	}
	
//	public RouterFunction<ServerResponse> routerDemo(){
//		var message = new Message("Hello", "Hello from router function");
//		var response = EntityResponse.fromObject(message).build();
//		return RouterFunctions.route().GET("/router-demo", req -> response).build();
//	}
	
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new MappingJackson2HttpMessageConverter());
	}
	
	
	
}
