package com.enola.hello.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.enola.hello.annotations.HandlerInterceptorBean;

@HandlerInterceptorBean
public class HelloInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		System.out.println("Hello from Interceptor PreHandle.");
		
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,@Nullable ModelAndView modelAndview) throws Exception {
		System.out.println("Hello from Interceptor Post");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler ,@Nullable Exception ex) throws Exception {
		System.out.println("Hello from Interceptor After Completed.");
	}
	
} 
 