package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	// http://localhost:9090
	@RequestMapping("/")
	public  String   home() {
		return "home";
	}
	// login
	@RequestMapping("/LoginForm")
	public ModelAndView loginForm() {
		ModelAndView mv = new ModelAndView();
	}
}
