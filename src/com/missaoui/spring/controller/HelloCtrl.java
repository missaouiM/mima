package com.missaoui.spring.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 
@Controller
public class HelloCtrl {
	public HelloCtrl(){
		System.out.println("Controller HelloCtrl");
	}
	
	@RequestMapping("/")
	public String hello(Model model){
		model.addAttribute("name","Mahmoud Missaouiii");
		return "Welcome";
	}
	@RequestMapping("test")
	public String helloTest(Model model){
		model.addAttribute("name","Test Mapping");
		return "Welcome";
	}			

}
