package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewHomeController {

	@RequestMapping("/index.htm")
	public String viewName() {
		System.out.println("Biswaranjan");
		return "index";
		
	}
}
