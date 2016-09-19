package com.missaoui.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.missaoui.spring.model.Client;
import com.missaoui.spring.service.ClientService;
import com.missaoui.spring.viewBean.LoginBean;


@Controller
public class LoginController {
	@Autowired
	private ClientService clientService;
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView displayLogin(){
		return new ModelAndView("login","loginBean", new LoginBean());
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView executeLogin(@ModelAttribute("loginBean") LoginBean loginBean){
		if (loginBean.getEmail() != null){
			System.out.println(loginBean.getEmail());
			
		}
		if (loginBean.getPassword() != null){
			System.out.println(loginBean.getPassword());
			
		}
		if (clientService.isValidClient(loginBean.getEmail(), loginBean.getPassword())){
			System.out.println("Login succes");
		}
		else{
			System.out.println("Login failed");
		}
		
		return new ModelAndView("login","loginBean", loginBean);
		
	}
	
	@RequestMapping(value="/signUp",method=RequestMethod.GET)
	public ModelAndView displaySignUp(){
		return new ModelAndView("signUp","client",new Client());
	}
	
	@RequestMapping(value="/signUp",method=RequestMethod.POST)
	public ModelAndView executeSignUp(@ModelAttribute("client") Client client){
		clientService.saveClient(client);
		return new ModelAndView("login","loginBean", new LoginBean());
	}

}
