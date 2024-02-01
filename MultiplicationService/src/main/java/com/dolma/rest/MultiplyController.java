package com.dolma.rest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MultiplyController {


//http://localhost:1111/multiply?a=5&b=10
    @GetMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
    	
    	RestTemplate rs=new  RestTemplate();
    	
        ResponseEntity<Integer> response = rs.getForEntity("http://localhost:2222/add?a={a}&b={b}", Integer.class, a, b);
        int additionResult = response.getBody();
        return ("The result is "+ a * additionResult);
    }
	
}
