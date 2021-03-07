package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(path="/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("Home url");
		
		model.addAttribute("name", "John");
		model.addAttribute("id", 48484);
		
		List<String> friends = new ArrayList<String>();
		friends.add("wick");
		friends.add("stwert");
		friends.add("Gaurav");
		
		model.addAttribute("friends", friends);
		
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
	public ModelAndView help() {
		System.out.println("help page");
		
		//modelAndView object
		ModelAndView mav = new ModelAndView();
		//setting the data
		mav.addObject("name", "wick");
		mav.addObject("rollNumber", 859);
		LocalDateTime now = LocalDateTime.now();
		mav.addObject("time", now);
		//setting view
		mav.setViewName("help");
		
		//Marks
		List<Integer> mark = new ArrayList<Integer>();
		mark.add(988);
		mark.add(844848);
		mark.add(8488);
		
		mav.addObject("marks", mark);
		
		return mav;
	}
}
