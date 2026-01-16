package com.ey.security;

import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
	   private static final String SECRET_KEY = "bike_service_secret";
	   private static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour
	   public static String generateToken(String email, String role) {
	       return Jwts.builder()
	               .setSubject(email)
	               .claim("role", role)
	               .setIssuedAt(new Date())
	               .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
	               .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
	               .compact();
	   }
	   public static Claims extractClaims(String token) {
	       return Jwts.parser()
	               .setSigningKey(SECRET_KEY)
	               .parseClaimsJws(token)
	               .getBody();
	   }
	   public static boolean isTokenExpired(String token) {
	       return extractClaims(token).getExpiration().before(new Date());
	   }
	   public static String extractEmail(String token) {
	       return extractClaims(token).getSubject();
	   }
	}