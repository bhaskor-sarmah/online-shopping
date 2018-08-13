package net.bjs.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView getRoot() {
		ModelAndView mv = new ModelAndView("page");
		return mv;
	}
	
//	@RequestMapping(value = "/test")
//	public ModelAndView getGreetings(@RequestParam(value="message", required=false) String greeting) {
//		ModelAndView mv = new ModelAndView("page_test");
//		if(null==greeting) {
//			greeting  = "Hello There !";
//		}
//		mv.addObject("greeting",greeting);
//		return mv;
//	}
//	
//
//
//	@RequestMapping(value = "/test/{message}")
//	public ModelAndView getGreetingsFromPath(@PathVariable("message") String greeting) {
//		ModelAndView mv = new ModelAndView("page_test");
//		if(null==greeting) {
//			greeting  = "Hello There !";
//		}
//		mv.addObject("greeting",greeting);
//		return mv;
//	}
	
}
