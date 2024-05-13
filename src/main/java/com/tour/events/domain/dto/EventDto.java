package com.tour.events.domain.dto;

import java.util.Date;
import java.util.List;

public class EventDto {

    private int idDto;
    private String nameDto;
    private String locationDto;
    private Date startDto;
    private Date finishDto;
    private int availabilityDto;

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

    public int getAvailabilityDto() {
        return availabilityDto;
    }

    public void setAvailabilityDto(int availabilityDto) {
        this.availabilityDto = availabilityDto;
    }

    public int getTotalAvailableTickets() {
        return tickets.stream().mapToInt(TicketDto::getNumberDto).sum();
    }

    public void addTicket(TicketDto ticket) {
        tickets.add(ticket);
    }

    public void removeTicket(TicketDto ticket) {
        tickets.remove(ticket);
    }

    public List<TicketDto> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketDto> tickets) {
        this.tickets = tickets;
    }
}
