package net.bjs.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home","/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring Web MVC");
		return mv;
	}
	
	@RequestMapping(value = "/**")
	public ModelAndView error() {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("greeting","Error ! Page not found");
		return mv;
	}
	

	@RequestMapping(value = "/test")
	public ModelAndView getGreetings(@RequestParam(value="message", required=false) String greeting) {
		ModelAndView mv = new ModelAndView("page");
		if(null==greeting) {
			greeting  = "Hello There !";
		}
		mv.addObject("greeting",greeting);
		return mv;
	}
	
}
