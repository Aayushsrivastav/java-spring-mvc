package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	//To use common data in multiple page
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Spring mvc");
		m.addAttribute("description", "model attribute");
	}

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	///////////////////////////////Using Model Attribute ////////////////////////////
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String processFrom(@ModelAttribute User user, Model model) {
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		
		int id = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id " + id);
		return "success";
	}
	
	
	//////////////////////Request mapping without model////////////////////////////
//	@RequestMapping(path="/processform", method = RequestMethod.POST)
//	public String processFrom(
//			@RequestParam(name = "userName", required = true) String userName,
//			@RequestParam("userEmail") String userEmail,
//			@RequestParam("userPassword") String userPassword,
//			Model model) {
//		
////		System.out.println("user name" + userName);
////		System.out.println("user email" + userEmail);
////		System.out.println("user password" + userPassword);
//		
//		User user = new User();
//		user.setUserName(userName);
//		user.setUserEmail(userEmail);
//		user.setUserPassword(userPassword);
//		
//		System.out.println(user);
//		
////		model.addAttribute("userName", userName);
////		model.addAttribute("userEmail", userEmail);
////		model.addAttribute("userPassword", userPassword);
//		
//		model.addAttribute("user", user);
//		return "success";
//	}
	
	
	////////////Old method using hhtp servlet requests///////////////////
//	@RequestMapping(path="/processform", method = RequestMethod.POST)
//	public String processFrom(HttpServletRequest request) {
//		String name = request.getParameter("userName");
//		System.out.println(name);
//		return "contact";
//	}
}
