package com.azure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller("test")
@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = "hello", method = {RequestMethod.GET})
	public String hello(String userName) {
		return "Hello " + userName;
	}
}
