package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("About page");
		return "about";
	}
	
	@RequestMapping("/service")
	public String service() {
		System.out.println("service page");
		return "services";
	}
	
	@RequestMapping("/help")
	public String help() {
		System.out.println("help page");
		return "help";
	}
}
