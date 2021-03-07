package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	/////////////////////Using redirect prefix//////////////////
	@RequestMapping("/one")
	public String one() {
		System.out.println("one");
		return "redirect:/two";
	}
	
	///////////////////////Using redirect view////////////////////////////
//	@RequestMapping("/one")
//	public RedirectView one() {
//		System.out.println("one");
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl("two");
//		return redirectView;
//	}
	
/////////////////////Using http servlet response//////////////////
//	@RequestMapping("/one")
//	public String one(HttpServletResponse response) {
//		System.out.println("one");
//		try {
//			response.sendRedirect("");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return "";
//	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("two");
		return "contact";
	}
	
}
