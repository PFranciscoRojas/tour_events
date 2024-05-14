package com.tour.events.infraestructure;

import com.tour.events.domain.dto.TicketDto;
import com.tour.events.domain.repository.TicketDtoRepository;
import com.tour.events.infraestructure.entities.Ticket;
import com.tour.events.infraestructure.mapper.TicketMapper;
import com.tour.events.infraestructure.repositories.TicketCrudRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TicketRepository implements TicketDtoRepository {

    @Autowired
    private TicketCrudRepository ticketRepo;

    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public List<TicketDto> getAll() {
       List<Ticket> tickets = (List<Ticket>) ticketRepo.findAll();
       return ticketMapper.toTickets(tickets);
    }

    @Override
    public Optional<TicketDto> getById(Integer idTicketDto) {
       Optional<Ticket> ticket = ticketRepo.findById(idTicketDto);
       return ticketMapper.toTicketsDtoOptional(ticket);
    }

    @Override
    public TicketDto save(TicketDto ticketDto) {
       Ticket ticket = ticketMapper.toTicket(ticketDto);
       return ticketMapper.toTicketDto(ticketRepo.save(ticket));
    }

    @Override
    public void cancelTicket(Integer idTicketDto) {
       Optional<Ticket> ticketOptional = ticketRepo.findById(idTicketDto);
       if (ticketOptional.isPresent()) {
           Ticket ticket = ticketOptional.get();
           ticket.setStatus(false); 
           ticketRepo.save(ticket); 
       } else {
           throw new IllegalArgumentException("Ticket with ID " + idTicketDto + " not found");
       }
    }
}
