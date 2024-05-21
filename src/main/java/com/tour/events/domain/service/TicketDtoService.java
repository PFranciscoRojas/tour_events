package com.tour.events.domain.service;

import com.tour.events.domain.dto.EventSaveDto;
import com.tour.events.domain.dto.TicketDto;
import com.tour.events.domain.repository.EventDtoRepository;
import com.tour.events.domain.repository.TicketDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketDtoService {
    @Autowired
    private TicketDtoRepository ticketRepo;

    @Autowired
    private EventDtoRepository eventRepo;

    public List<TicketDto> getAll(){
        return ticketRepo.getAll();
    }

    public Optional<TicketDto> getByID(Integer ticketID){
        return ticketRepo.getById(ticketID);
    }

    public TicketDto save(TicketDto ticketDto){
        TicketDto savedTicketDto = ticketRepo.save(ticketDto);
        updateEventAvailability(ticketDto.getEventSaveDto().getIdDto());

        return savedTicketDto;
    }

    private void updateEventAvailability(Integer eventId) {
        List<TicketDto> tickets = ticketRepo.getByEventId(eventId);
        int totalTicketsSold = tickets.stream().mapToInt(TicketDto::getNumberDto).sum();
        Optional<EventSaveDto> optionalEvent = eventRepo.getByIdSave(eventId);
        if (optionalEvent.isPresent()) {
            EventSaveDto eventDto = optionalEvent.get();
            int newAvailability = eventDto.getCapacityDto() - totalTicketsSold;
            eventDto.setAvailabilityDto(newAvailability);
            eventRepo.save(eventDto);
        } else {
            throw new RuntimeException("Event not found with ID: " + eventId);
        }
    }

    public void cancelTicket(Integer ticketID) {
        ticketRepo.cancelTicket(ticketID);
    }
}
