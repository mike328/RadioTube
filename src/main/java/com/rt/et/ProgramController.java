package com.rt.et;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramController {
	@GetMapping("/program")
	public String program(){
		return "program";
	}
}
