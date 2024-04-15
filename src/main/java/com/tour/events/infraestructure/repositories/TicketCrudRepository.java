package com.tour.events.infraestructure.repositories;

import com.tour.events.infraestructure.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketCrudRepository  extends CrudRepository<Ticket, Integer> {
}
