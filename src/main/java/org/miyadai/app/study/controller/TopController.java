package org.miyadai.app.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView top(ModelAndView model) {
		model.setViewName("top");
		model.addObject("message", "Hello World!!");
		return model;
	}
}
