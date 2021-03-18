package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/koko/ten/{name}/tuoi/{tuoi}")
	public Person hello (@PathVariable String name , @PathVariable int tuoi) {
		
		Person nguoi1 = new Person(name ,tuoi );
		return nguoi1;	
	}
	@GetMapping("/tan")
	public String hello2 () {
		
		
		return "Chao moi nguoi";	
	}
}
