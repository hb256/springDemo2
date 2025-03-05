package com.example.run;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RunController {

	private final RunRepository runRepository;

	public RunController(RunRepository runRepository) {
		this.runRepository = runRepository;
	}

	@GetMapping("/runs")
	List<Run> findAll() {
		return runRepository.findAll();
	}

//	@GetMapping("/hello")
//	public String sayHello() {
//		return "Hello, runner!";
//	}

}
