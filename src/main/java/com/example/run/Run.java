package com.example.run;

import java.time.LocalDateTime;

public record Run(Integer id, String title, LocalDateTime startedOn, LocalDateTime completedOn, Integer distance,
		Location location) {

}
