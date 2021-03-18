package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HiController {
	
	@GetMapping
	public Person hello () {
		
		Person nguoi1 = new Person("tan" , 2);
		return nguoi1;	
	}
	@GetMapping("/tan")
	public Person hello2 () {
		
		Person nguoi1 = new Person("tan dep trai" , 18	);
		return nguoi1;	
	}
}
