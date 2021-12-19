package org.miyadai.app.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ErrorController {

	@RequestMapping(value = "errors", method = RequestMethod.GET)
	public String renderErrorPage() {
		return "error";
	}

	@RequestMapping(value = "errors", method = RequestMethod.POST)
	public String renderErrorPagePost() {
		return "error";
	}

	@RequestMapping(value = "accessDenied", method = RequestMethod.GET)
	public String renderAccessDeniedPage() {
		return "accessDenied";
	}

	@RequestMapping(value = "accessDenied", method = RequestMethod.POST)
	public String renderAccessDeniedPagePost() {
		return "accessDenied";
	}
}
