package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read request param from html form
		String theName = request.getParameter("studentName");
		
		// convert to upper case
		theName = theName.toUpperCase();
		
		// create message
		String result = "Yo! " + theName + "!";
		
		// add to model
		model.addAttribute("message",result);
		
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDudeThree(@RequestParam("studentName") String theName, Model model) {
		// convert to upper case
		theName = theName.toUpperCase();
		
		// create message
		String result = "Greetings from the V3, " + theName + "!";
		
		// add to model
		model.addAttribute("message",result);
		
		
		return "helloworld";
	}
}
