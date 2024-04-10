package com.tour.events.infraestructure.mapper;

import com.tour.events.domain.dto.TicketDto;
import com.tour.events.infraestructure.entities.Ticket;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface TicketMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "status", target = "status"),
            @Mapping(source = "type", target = "type"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "number", target = "number"),
            @Mapping(source = "presale", target = "presale"),
            @Mapping(source = "createdAt", target = "createdAt"),
            @Mapping(source = "updatedAt", target = "updatedAt")
    })
    TicketDto toTicketDto(Ticket ticket);

    List<TicketDto> toTickets(List<Ticket> tickets);

    default Optional<TicketDto> toTicketsOptional(Optional<Ticket> ticket ){
        return  ticket.map(this::toTicketDto);
    }

    @InheritInverseConfiguration
    @Mapping(target = "event", ignore = true)
    Ticket toTicket(TicketDto ticketDto);

}

