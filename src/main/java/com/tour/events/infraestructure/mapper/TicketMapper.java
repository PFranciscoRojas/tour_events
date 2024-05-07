package com.tour.events.infraestructure.mapper;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.dto.EventSaveDto;
import com.tour.events.domain.dto.TicketDto;
import com.tour.events.infraestructure.entities.Event;
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
            @Mapping(source = "id", target = "idDto"),
            @Mapping(source = "status", target = "statusDto"),
            @Mapping(source = "type", target = "typeDto"),
            @Mapping(source = "price", target = "priceDto"),
            @Mapping(source = "number", target = "numberDto"),
            @Mapping(source = "presale", target = "presaleDto"),
            @Mapping(source = "event", target = "eventSaveDto"),
//            @Mapping(source = "createdAt", target = "createdAt"),
//            @Mapping(source = "updatedAt", target = "updatedAt")
    })
    TicketDto toTicketDto(Ticket ticket);

    List<TicketDto> toTickets(List<Ticket> tickets);

    default Optional<TicketDto> toTicketsDtoOptional(Optional<Ticket> ticket ){
        return  ticket.map(this::toTicketDto);
    }


    @InheritInverseConfiguration
//    @Mapping(target = "event", ignore = true)
    Ticket toTicket(TicketDto ticketDto);

}

