package com.example.URLshortner.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FullShortURLController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loadIndex() {
		return "index";
	}
	
}
