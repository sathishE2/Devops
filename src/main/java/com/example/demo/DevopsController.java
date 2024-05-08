package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	@GetMapping("/getall")
	public String getal() {
		return "tols";
	}
	

}
