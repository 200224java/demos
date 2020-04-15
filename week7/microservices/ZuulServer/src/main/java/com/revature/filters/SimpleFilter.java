package com.revature.filters;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class SimpleFilter extends ZuulFilter {
	
	private static Logger log = LogManager.getLogger(SimpleFilter.class);
	
	/**
	 * There are different types of filters that may trigger at some point
	 * while zuul is processing the request
	 * 
	 * There are 4 main types:
	 * 	- "pre": The filter is executed before the request is routed
	 *  - "post": The filter is executed after the request has been routed
	 *  - "route": The filter that will actually handle the routing of the request
	 *  - "error": The filter that will execute if an error occurs
	 */

	// This method determines whether this filter is active or not
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest req = ctx.getRequest();
		
		log.info("There are no Requests ........ Only ZUUL!");
		log.info(String.format("%s request routed to %s", req.getMethod(), req.getRequestURL().toString()));
		
		return null;
	}

	// The string that you return determines the type of the filter
	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}
}
