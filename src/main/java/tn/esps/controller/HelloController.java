package tn.esps.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello") // accces au controlleur : http://localhost:8080/hello
public class HelloController {

	@GetMapping("/home")
	// acces à la méthode: http://localhost:8080/hello/home
	public String goToHello(Model model) {
		model.addAttribute("serverTime", LocalTime.now());
		return "hello"; // --> va à la page hello.html
	}

	@GetMapping("/home2")
	// acces à la méthode: http://localhost:8080/hello/home
	public ModelAndView goToHello2() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("serverTime", LocalDate.now());

		modelAndView.setViewName("hello");// --> va à la page hello.html
		return modelAndView;
	}
}
