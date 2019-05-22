package com.eduportal.demo.controller;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@CrossOrigin("http://localhost:4200")
public class TestSecurityController {
	@GetMapping("/user")
    @ResponseBody
    public Principal user(Principal user) {
		System.out.println("user name is "+user.getName());
        return user;
    }
	//@CrossOrigin("http://localhost:4200")
	@GetMapping("/resource")
    @ResponseBody
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }
	
	@GetMapping(value = "/{path:[^\\.]*}")
    public String redirect() {
        return "forward:/";
    }
	
  
}
