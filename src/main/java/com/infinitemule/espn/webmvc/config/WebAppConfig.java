/*
 * Spring ESPN WebMVC
 */
package com.infinitemule.espn.webmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration   
@ComponentScan("com.infinitemule.espn.webmvc")  
@EnableWebMvc
public class WebAppConfig extends WebMvcConfigurerAdapter {  
      
  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }
  
  @Bean
  public InternalResourceViewResolver getInternalResourceViewResolver() {
      
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/jsp/");
    resolver.setSuffix(".jsp");
    resolver.setContentType("text/html");
    
    return resolver;
  }
  
}  