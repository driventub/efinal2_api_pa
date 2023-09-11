package uce.edu.efinal2_api_pa.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;

@Component
public class JwtUtils {
	
	private static final Logger LOG = LoggerFactory.getLogger(AuthTokenFilter.class);

	@Value("${app.jwt.secret}")
	private String jwtSecret;
	
	public boolean validateJWtToken(String token) {
		boolean flag = false;
		try {
		Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
		flag = true;
		LOG.info("Paso el toke: " + token);
		}catch(ExpiredJwtException e) {
			LOG.error("Token expirado: "+e.getMessage());
		}/*catch(SignatureException e) {
			log.error("Token invalido: "+e.getMessage());
		}*/
		return flag;
	}

	public String getUserNameFromJwtToken(String token) {
		return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
	}
}
