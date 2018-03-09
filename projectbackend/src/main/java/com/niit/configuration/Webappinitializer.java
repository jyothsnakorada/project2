package com.niit.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//web.xml configuration

public class Webappinitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		  return new Class[]{DBConfig.class};
		 }
	@Override
		 protected Class<?>[] getServletConfigClasses() {
		  return new Class[]{WebAppconfig.class};
		 }
	@Override
		 protected String[] getServletMappings() {
		  return new String[]{"/"};
		 }
		}


