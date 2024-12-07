package com.tour.events.infraestructure.repositories;

import com.tour.events.infraestructure.entities.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventCrudRepository extends CrudRepository<Event, Integer> {
    List<Event> findByCity(String city);
    List<Event> findByName(String name);
}
