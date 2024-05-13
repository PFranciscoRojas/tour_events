package com.tour.events.domain.repository;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.dto.EventSaveDto;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Primary

public class EventDtoRepositoryImpl implements EventDtoRepository {

    private final List<EventDto> eventList = new ArrayList<>();

    @Override
    public List<EventDto> getAll() {
        return new ArrayList<>(eventList);
    }

    @Override
    public Optional<EventDto> getById(int id) {
        return eventList.stream()
                .filter(event -> event.getIdDto() == id)
                .findFirst();
    }

    @Override
    public List<EventDto> getByCity(String city) {
        List<EventDto> eventsInCity = new ArrayList<>();
        for (EventDto event : eventList) {
            if (event.getLocationDto().equalsIgnoreCase(city)) {
                eventsInCity.add(event);
            }
        }
        return eventsInCity;
    }

    @Override
    public List<EventDto> getByName(String name) {
        List<EventDto> eventsWithName = new ArrayList<>();
        for (EventDto event : eventList) {
            if (event.getNameDto().equalsIgnoreCase(name)) {
                eventsWithName.add(event);
            }
        }
        return eventsWithName;
    }

    @Override
    public Optional<EventDto> getById(Integer idEventDto) {
        return eventList.stream()
                .filter(event -> event.getIdDto() == idEventDto)
                .findFirst();
    }

    @Override
    public EventSaveDto save(@NotNull EventSaveDto eventSaveDto) {

        EventDto newEvent = new EventDto();
        newEvent.setIdDto(eventList.size() + 1); // Asignar un nuevo ID
        newEvent.setNameDto(eventSaveDto.getNameDto());
        newEvent.setLocationDto(eventSaveDto.getDescriptionDto());
        newEvent.setLocationDto(eventSaveDto.getLocationDto());
        newEvent.setStartDto(eventSaveDto.getStartDto());
        newEvent.setFinishDto(eventSaveDto.getFinishDto());
        newEvent.setAvailabilityDto(eventSaveDto.getAvailabilityDto());

        // Agregar el nuevo evento a la lista de eventos
        eventList.add(newEvent);

        // Devolver el DTO de guardado
        return eventSaveDto;
    }

    @Override
    public EventDto save(EventDto eventDto) {
        eventList.add(eventDto);
        return eventDto;
    }

    @Override
    public void delete(int id) {
        eventList.removeIf(event -> event.getIdDto() == id);
    }
}
