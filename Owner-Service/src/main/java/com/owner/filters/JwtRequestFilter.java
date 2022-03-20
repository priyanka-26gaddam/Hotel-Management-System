package com.owner.filters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.owner.jwtutil.JwtUtil;
import com.owner.securityconfigure.UserService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

//    @Autowired
//    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private UserService userservice;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
    throws ServletException, IOException {
    String authorizationHeader= request.getHeader("Authorization");
    String username=null;
    String jwtToken =null;
    if (authorizationHeader != null && authorizationHeader.startsWith("bearer ")) {
    jwtToken= authorizationHeader.substring(7);
    username=jwtUtil.extractUsername(jwtToken);
    }
    if (username != null && SecurityContextHolder.getContext().getAuthentication()==null) {
    UserDetails currentUserDetails=userservice.loadUserByUsername(username);
    Boolean token= jwtUtil.validateToken(jwtToken, currentUserDetails);
    if (token) {
    UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=
    new UsernamePasswordAuthenticationToken(currentUserDetails, null, currentUserDetails.getAuthorities());
    usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource()
    .buildDetails(request));
    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
    }
    }
    filterChain.doFilter(request, response);
    }
    }


//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
//            throws ServletException, IOException {
//
//        final String authorizationHeader = request.getHeader("Authorization");
//
//        String username = null;
//        String jwt = null;
//
//        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
//            jwt = authorizationHeader.substring(7);
//            username = jwtUtil.extractUsername(jwt);
//        }
//
//
//        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//
//            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
//
//            if (jwtUtil.validateToken(jwt, userDetails)) {
//
//                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
//                        userDetails, null, userDetails.getAuthorities());
//                usernamePasswordAuthenticationToken
//                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//            }
//        }
//        chain.doFilter(request, response);
//    }
//
