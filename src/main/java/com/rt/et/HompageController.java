package com.rt.et;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rt.et.repo.AudioRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/")
@Controller
public class HompageController {	
	
	AudioRepository x;
	@GetMapping
	public String viewer() {
		log.info("Mapped Index");
		
	
		
		return "index";
		
	}
	
	
	
}
