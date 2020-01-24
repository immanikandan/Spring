package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller
@ResponseBody
public class Test{
	@GetMapping(path="/login")
	String meth() {
		return "Login Successfully";
	}
	@GetMapping(path="/login/bean/{name}")
	String pathvariable(@PathVariable String name) {
		return name;
	}

}
