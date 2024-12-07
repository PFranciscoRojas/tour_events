package com.tour.events.domain.service;

import com.tour.events.domain.dto.TicketDto;
import com.tour.events.domain.repository.TicketDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketDtoService {
    @Autowired
    private TicketDtoRepository ticketRepo;

    public List<TicketDto> getAll(){
        return ticketRepo.getAll();
    }

    public Optional<TicketDto> getByID(Integer ticketID){
        return ticketRepo.getById(ticketID);
    }

    public TicketDto save(TicketDto ticketDto){
        return ticketRepo.save(ticketDto);
    }
}
