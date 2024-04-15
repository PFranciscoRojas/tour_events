package com.tour.events.infraestructure.repositories;

import com.tour.events.infraestructure.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventCrudRepository extends CrudRepository<Event, Integer> {
}
