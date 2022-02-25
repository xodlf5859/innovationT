package com.innovationT.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class testController {

	@RequestMapping("/zz")
	public String test() throws Exception{
		return "jsp";
	}
	
	@RequestMapping("/file")
	public String fileTest() throws Exception{
		return "fileTest";
	}
	
	
}
