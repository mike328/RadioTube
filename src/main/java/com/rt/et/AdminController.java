package com.rt.et;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rt.et.entity.Audio;
import com.rt.et.repo.AudioRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("")
@Controller
public class AdminController {
	@Autowired
	private AudioRepository AR;

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	} 
	@GetMapping("/adminl")
	public String adminloggedin() {
		return "adminlog";
	}
	
	@ModelAttribute(name="audiotobeadded")
	public Audio aud() {
		return new Audio();
		}
	
	@PostMapping("/adminl")
	public String getRequestP(@ModelAttribute Audio audiotobeadded ) {
		
		log.info(audiotobeadded.getDescription());
		/*
		Audio x=new Audio();
		x.setAid(null);
		x.setChannelid(3);
		x.setDatetransmitted(null);
		x.setImgpath(null);
		x.setDescription(null);
		x.setPath(null);
		x.setProgramtypeid(3);
		x.setRating(0);
		x.setDateuploaded(null);
		AR.save(x);
		*/
		
		return " gf";
	} 
	
}
