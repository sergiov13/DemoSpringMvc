package com.sergio.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BreakerController {

	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "helloworld";
	}
}
