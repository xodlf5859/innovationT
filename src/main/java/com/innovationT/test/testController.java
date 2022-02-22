package com.innovationT.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {

	@RequestMapping("/zz")
	public String test() throws Exception{
		return "zz";
	}
}
