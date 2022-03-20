//package com.owner.resource;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.owner.jwtmodels.AuthenticationRequest;
//import com.owner.securityconfigure.UserModel;
//import com.owner.securityconfigure.UserRepository;
//import com.owner.securityconfigure.UserService;
//
//import com.owner.jwtutil.*;
//
//
//
//
//@RestController
//@CrossOrigin(origins="*")
//public class AuthController {
//@Autowired
//UserRepository userrepo;
//
//@Autowired
//AuthenticationManager authenticates;
//
//@Autowired
//UserService userservice;
//
//@Autowired
//JwtUtil jwtutil;
//
//
//
//
//@PostMapping("/subs")
//
//
//
//public ResponseEntity<?> subscribeClient(@RequestBody AuthenticationRequest authreq)
//{
//String username=authreq.getUsername();
//String password=authreq.getPassword();
//
//UserModel usermodel =new UserModel();
//usermodel.setUsername(authreq.getUsername());
//usermodel.setPassword(authreq.getPassword());
//
//try {
//userrepo.save(usermodel);
//}
//catch(Exception e)
//{
//return ResponseEntity.ok("Error during subscription");
//}
//
//
//
//return ResponseEntity.ok("Successfully subcribed "+username);
//}
//
//
//
//@PostMapping("/auth")
//
//
//
//public ResponseEntity<?> authenticateClient(@RequestBody AuthenticationRequest authenticationRequest)
//{
//
//
//
//
//
//String username=authenticationRequest.getUsername();
//String password=authenticationRequest.getPassword();
//
//
//
//try
//{
//authenticates.authenticate(new UsernamePasswordAuthenticationToken(username,password));
//}
//catch(Exception e)
//{
//return ResponseEntity.ok("Error during authentication");
//}
//
//
//
//UserDetails userdetails= userservice.loadUserByUsername(username);
//
//
//
//String generatedToken=jwtutil.generateToken(userdetails);
//
//
//
//
//
//return ResponseEntity.ok(generatedToken );
////return ResponseEntity.ok(new AuthenticationResponse("Successfully subcribed "+username));
//
//
//
//}
//
//
//
//@GetMapping("/test")
//private String testingtoken() {
//try {
//return "Testing Successful...!";
//}
//catch(Exception e) {
//return "Please login first..!";
//}
//}
//
//@GetMapping("/dashboard")
//private String dashboard() {
//return "Welcome to dashboard...!";
//}
//
//}
//
