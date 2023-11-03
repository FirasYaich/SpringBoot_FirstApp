package tn.esps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import tn.esps.dto.StudentDto;
import tn.esps.service.StudentService;

@Controller

@RequestMapping("/students") // accces au controlleur : http://localhost:8080/hello
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	// acces à la méthode: http://localhost:8080/students/
	public ModelAndView findAll() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("students", studentService.findAll());

		modelAndView.setViewName("students");// --> va à la page students.html
		return modelAndView;
	}

	@ResponseBody
	@GetMapping("/json")
	// acces à la méthode: http://localhost:8080/students/
	public List<StudentDto> findAllJson() {
		ModelAndView modelAndView = new ModelAndView();
		return studentService.findAll();
	}

	// @RequestParam --> valeur provenant du formulaire html
	@PostMapping("/save")
	public String save(@RequestParam("id") Integer id, @RequestParam("name") String name,
			@RequestParam("gender") char gender, Model model) {
		studentService.save(new StudentDto(id, name, gender));

		return "redirect:/students"; // --> va à la page students.html

		// model.addAttribute("students", studentService.findAll());
		// return "students";// --> va à la page students.html
	}

	@PostMapping("/save2")
	public String save(@ModelAttribute StudentDto studentDto) {
		studentService.save(studentDto);
		return "redirect:/students"; // --> va à la page students.html

	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		studentService.delete(id);
		return "redirect:/students";// --> va à la page students.html
	}

}
