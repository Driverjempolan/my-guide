package com.stackroute.restaurantspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("hi")
	public String displayRestaurant() {

		return "Hi user service is under development";
	}
}
