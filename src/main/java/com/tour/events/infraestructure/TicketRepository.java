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
    public TicketCrudRepository ticketRepo;

    @Autowired
    public TicketMapper ticketMapper;

    @Override
    public List<TicketDto> getAll() {
       List<Ticket> tickets = (List<Ticket>) ticketRepo.findAll();
       return ticketMapper.toTickets(tickets);
    }

    @Override
    public Optional<TicketDto> getById(Integer idTicketDto) {
       Optional<Ticket> ticket = ticketRepo.findById( idTicketDto);
       return ticketMapper.toTicketsOptional(ticket);
    }

    @Override
    public TicketDto save(TicketDto ticketDto) {
       Ticket ticket = ticketMapper.toTicket(ticketDto);
       return ticketMapper.toTicketDto(ticketRepo.save(ticket));
    }
}
