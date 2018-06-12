package com.sergio.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//need a controller method to process de HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormV2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form 
		String theName = request.getParameter("studentName");
		//Convert the data to all upper case
		theName.toUpperCase();
		//create the mesage
		String result = "YO! Sup dawg!"+theName;
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormV3")
	public String letsShout(@RequestParam("studentName") String theName, Model model) {
		String result = "Sup DAWG! "  + theName.toUpperCase();
		model.addAttribute("message", result);
		return "helloworld";
	}
	
}
