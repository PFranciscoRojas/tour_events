package com.tour.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.tour.events.infraestructure.mapper",
		"com.tour.events.application.controller",
		"com.tour.events.domain.repository",
		"com.tour.events.domain.service"})
public class EventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsApplication.class, args);
	}

}
