package com.lookout.rest.training.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lookout.rest.training.beans.Helloworld;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloworld() {
		return "Hello world!!!!";
	}
	
	@RequestMapping(value = "/helloworldBean", method = RequestMethod.GET)
	public Helloworld helloworldBean() {
		return new Helloworld("Hello world java.......");
	}
	
	@RequestMapping(value = "/getAccountBalance", method = RequestMethod.GET)
	public Integer helloworldBean(@RequestParam(name = "accId",required = true,defaultValue = "5000") Integer accountId) {
		return 10000+accountId;
	}
	
	@RequestMapping(value = "/names", method = RequestMethod.GET)
	public String helloworldBean(@RequestParam List<String> names) {
		return " Hi :" + names;
	}
	
	@GetMapping("/api/employeeswithvariable/{id}")
	public String getEmployeesByIdWithVariableName(@PathVariable("id") String employeeId) {
	    return "ID: " + employeeId;
	}
	
	
	
	
	
}
