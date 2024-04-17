package com.enola.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan( basePackages = {
		"com.enola.demo.service",
		"com.enola.demo.aspects"

})

@EnableAspectJAutoProxy(proxyTargetClass = true )
public class AppConfig {
	
}
