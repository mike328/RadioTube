package com.rt.et;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerController {
	
	@GetMapping("/player")
	public String player(){
		return "player";
	}
}
