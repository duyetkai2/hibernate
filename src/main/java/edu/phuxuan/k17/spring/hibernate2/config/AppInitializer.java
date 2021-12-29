package edu.phuxuan.k17.spring.hibernate2.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		 return new Class[] {
		            AppContext.class
		        };
		        //return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		 return new Class[] {
		            WebMvcConfig.class
		        };
	}

	@Override
	protected String[] getServletMappings() {
		  return new String[] {
		            "/"
		        };
	}

}
