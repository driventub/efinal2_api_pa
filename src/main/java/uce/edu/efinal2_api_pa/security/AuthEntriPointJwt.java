package uce.edu.efinal2_api_pa.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class AuthEntriPointJwt implements AuthenticationEntryPoint{

	private static final Logger LOG = LoggerFactory.getLogger(AuthEntriPointJwt.class);
	
	
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		LOG.error("----------------------- Unauthorized Error {}",authException.getMessage());
		LOG.error(request.getServletPath());
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	}



}
