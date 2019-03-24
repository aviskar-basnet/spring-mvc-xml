package com.aviskar.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MiscController {

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("name", "Aviskar");
		return "hello";
	}

	@RequestMapping(path = "/greeting", method = RequestMethod.GET)
	public ModelAndView greeting() {
		ModelAndView mv = new ModelAndView("greeting");
		mv.addObject("name", "Aviskar");
		return mv;
	}
}
