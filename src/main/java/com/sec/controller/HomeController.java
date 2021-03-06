package com.sec.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.sec.entity.User;


@Controller
public class HomeController {
	
    private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	
	@RequestMapping("/bloggers")
	public String bloggers(){
		return "bloggers";
	}
	
	@RequestMapping("/stories")
	public String stories(){
		return "stories";
	}
	
	@RequestMapping("/registration")
	public String registration(Model model){
		model.addAttribute("user", new User());
		return "registration";
	}
	
//	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	@PostMapping("/reg")
    public String greetingSubmit(@ModelAttribute User user) {
		System.out.println("UJ USER");
		log.info("Uj user!");
//		log.debug(user.getUsername());
//		log.debug(user.getPassword());
        return "auth/login";
    }

}
