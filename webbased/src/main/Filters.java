package com.reg.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class Filters {

	private FilterConfig config = null;
	  public void init(FilterConfig config) throws ServletException {
	    this.config = config;
	  }
	  public void destroy() {
	    config = null;
	  }
	  public void doFilter(ServletRequest request, ServletResponse response,
	                     FilterChain chain) throws IOException, ServletException {
	    long before = System.currentTimeMillis();
	    chain.doFilter(request, response);
	    long after = System.currentTimeMillis();
	    String name = "";
	    if (request instanceof HttpServletRequest) {
	      name = ((HttpServletRequest)request).getRequestURI();
	    }
	    config.getServletContext().log(name + ": " + (after - before) + "ms");
	  }
	}