package com.springbootMVC.springbootMCV1.controladores;

import java.util.Locale;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	@RequestMapping (value="/", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	@RequestMapping (value="login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping (value="home",method=RequestMethod.POST)
	public String user() {
		return "user";
	}
}