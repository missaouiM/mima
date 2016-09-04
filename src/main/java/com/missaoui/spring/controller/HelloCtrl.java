package com.missaoui.spring.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

 
@Controller
public class HelloCtrl {
	
	@GetMapping("/")
	public String hello(Model model){
		model.addAttribute("name","Mahmoud Missaouiii");
		return "Welcome";
	}
	@GetMapping("test")
	public String helloTest(Model model){
		model.addAttribute("name","Test Mapping");
		return "Welcome";
	}	

}
