package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Courses;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
		
		@GetMapping
		public List<Courses> list() {
			return null;
		}
	}
}
