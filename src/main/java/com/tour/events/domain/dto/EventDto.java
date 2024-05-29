package com.tour.events.domain.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.Date;
import java.util.List;


public class EventDto {

    private int idDto;
    @NotBlank(message = "El nombre no puede estar en blanco")
    private String nameDto;

    @NotBlank(message = "La ubicación no puede estar en blanco")
    private String locationDto;

    @NotNull(message = "La fecha de inicio no puede ser nula")
    @Future(message = "La fecha de inicio debe ser en el futuro")
    private Date startDto;

    @NotNull(message = "La fecha de finalización no puede ser nula")
    @Future(message = "La fecha de finalización debe ser en el futuro")
    private Date finishDto;

    @NotNull(message = "La disponibilidad no puede ser nula")
    @PositiveOrZero(message = "La disponibilidad debe ser un número positivo o cero")
    private Integer availabilityDto;

    private List<TicketDto> tickets;

    public int getIdDto() {
        return idDto;
    }

    public void setIdDto(int idDto) {
        this.idDto = idDto;
    }

    public String getNameDto() {
        return nameDto;
    }

    public void setNameDto(String nameDto) {
        this.nameDto = nameDto;
    }

    public String getLocationDto() {
        return locationDto;
    }

    public void setLocationDto(String locationDto) {
        this.locationDto = locationDto;
    }

    public Date getStartDto() {
        return startDto;
    }

    public void setStartDto(Date startDto) {
        this.startDto = startDto;
    }

    public Date getFinishDto() {
        return finishDto;
    }

    public void setFinishDto(Date finishDto) {
        this.finishDto = finishDto;
    }

    public Integer getAvailabilityDto() {
        return availabilityDto;
    }

    public void setAvailabilityDto(Integer availabilityDto) {
        this.availabilityDto = availabilityDto;
    }

    public int getTotalAvailableTickets() {
        int totalAvailableTickets = 0;
        if (tickets != null) {
            for (TicketDto ticket : tickets) {
                totalAvailableTickets += ticket.getNumberDto();
            }
        }
        return totalAvailableTickets;
    }

    public void setTickets(List<TicketDto> tickets) {
        this.tickets = tickets;
    }

}
