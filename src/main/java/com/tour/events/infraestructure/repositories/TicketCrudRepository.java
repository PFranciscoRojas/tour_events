package com.tour.events.infraestructure.repositories;

import com.tour.events.infraestructure.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketCrudRepository  extends CrudRepository<Ticket, Integer> {
    List<Ticket> findByEventId(int eventId);
}
