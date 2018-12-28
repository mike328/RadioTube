package com.rt.et;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChannelController {

	@GetMapping("/channel")
	public String channel(){
		return "channel";
	}
}
