package com.missaoui.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.missaoui.spring.viewBean.LoginBean;


@Controller
public class LoginController {
	
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
		return new ModelAndView("login","loginBean", loginBean);
		
	}

}
