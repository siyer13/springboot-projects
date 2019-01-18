package com.imf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@GetMapping("/")
	public ModelAndView homePage(Model model) {
		model.addAttribute("title", "Mutual Funds of India");
		model.addAttribute("message", "This is my first sping mvc page");
		return new ModelAndView("index");
	}

}
