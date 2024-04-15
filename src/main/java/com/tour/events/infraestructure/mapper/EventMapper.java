package com.tour.events.infraestructure.mapper;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.infraestructure.entities.Event;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface EventMapper {

    @Mappings({
            @Mapping(source = "id",  target = "idDto"),
            @Mapping(source = "name",  target = "nameDto"),
            @Mapping(source = "location",  target = "locationDto"),
            @Mapping(source = "start",  target = "startDto"),
            @Mapping(source = "finish",  target = "finishDto"),
            @Mapping(source = "availability", target = "availabilityDto")
    })
    EventDto toEventDto(Event event);

    List<EventDto> toEventsDto(List<Event> events);

    default Optional<EventDto> toEventsDtoOptional(Optional<Event> event){
        return event.map(this::toEventDto);
    }
    @InheritInverseConfiguration
    @Mapping(target = "description",ignore = true)
    @Mapping(target = "ageRestriction",ignore = true)
    @Mapping(target = "capacity",ignore = true)
    @Mapping(target = "type",ignore = true)
    @Mapping(target = "city",ignore = true)
    @Mapping(target = "address",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    Event toEvent(EventDto eventDto);

}
