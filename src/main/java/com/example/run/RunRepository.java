package com.example.run;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class RunRepository {

	private List<Run> runs = new ArrayList<>();

	List<Run> findAll() {
		return runs;
	}
	
	@PostConstruct
	private void init() {
		runs.add(new Run(1, "Monday Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 4,
				Location.INDOOR));
		runs.add(new Run(2, "Tuesday Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 3,
				Location.OUTDOOR));
	}
}
