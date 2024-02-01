package com.dolma.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {
	
//http://localhost:2222/add?a=5&b=10
	@GetMapping("/add")
     public int add(@RequestParam int a, @RequestParam int b) {
         return a + b;
     }

}
