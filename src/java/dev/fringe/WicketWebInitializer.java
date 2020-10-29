package dev.fringe;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.wicket.protocol.http.WicketFilter;
import org.apache.wicket.spring.SpringWebApplicationFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WicketWebInitializer implements ServletContextInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
	}

	@Bean
	public FilterRegistrationBean<WicketFilter> wicketFilter() {
		FilterRegistrationBean<WicketFilter> wicketFilter = new FilterRegistrationBean<>();
		wicketFilter.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.ERROR, DispatcherType.FORWARD, DispatcherType.ASYNC);
		wicketFilter.setAsyncSupported(true);
//		wicketFilter.setFilter(new JavaxWebSocketFilter());
		wicketFilter.setFilter(new WicketFilter());
		wicketFilter.addInitParameter(WicketFilter.APP_FACT_PARAM, SpringWebApplicationFactory.class.getName());
		wicketFilter.addInitParameter(WicketFilter.FILTER_MAPPING_PARAM, "/*");
		wicketFilter.addUrlPatterns("/*");
		return wicketFilter;
	}

	@Bean
	public WicketWebConfig application() {
		return new WicketWebConfig();
	}

}
