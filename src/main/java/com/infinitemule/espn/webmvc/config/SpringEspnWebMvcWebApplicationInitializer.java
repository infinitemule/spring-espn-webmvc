/*
 * Spring ESPN WebMVC
 */
package com.infinitemule.espn.webmvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;


/**
 * 
 */
public class SpringEspnWebMvcWebApplicationInitializer implements WebApplicationInitializer {

  
  @Override
  public void onStartup(ServletContext container) throws ServletException {
    
    ServletRegistration.Dynamic registration = 
        container.addServlet("spring-espn", new DispatcherServlet());
    
    registration.setLoadOnStartup(1);
    registration.addMapping("/");
    
    registration.setInitParameter("contextClass", 
        "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
    
    registration.setInitParameter("contextConfigLocation", WebAppConfig.class.getName());
    
  }
  
}
