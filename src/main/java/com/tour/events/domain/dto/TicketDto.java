package com.tour.events.domain.dto;

import com.tour.events.infraestructure.entities.Event;

import java.text.DateFormat;

public class TicketDto {

    private int idDto;
    private Boolean statusDto;
    private String typeDto;
    private Float priceDto;
    private Integer numberDto;
    private Boolean presaleDto;
    private DateFormat createdAtDto;
    private DateFormat updatedAtDto;
    private Event eventDto;

    public int getId() {
        return idDto;
    }

    public void setId(int id) {
        this.idDto = idDto;
    }

    public Boolean getStatus() {
        return statusDto;
    }

    public void setStatus(Boolean status) {
        this.statusDto = statusDto;
    }

    public String getType() {
        return typeDto;
    }

    public void setType(String type) {
        this.typeDto = typeDto;
    }

    public Float getPrice() {
        return priceDto;
    }

    public void setPrice(Float price) {
        this.priceDto = priceDto;
    }

    public Integer getNumber() {
        return numberDto;
    }

    public void setNumber(Integer number) {
        this.numberDto = numberDto;
    }

    public Boolean getPresale() {
        return presaleDto;
    }

    public void setPresale(Boolean presale) {
        this.presaleDto = presaleDto;
    }

    public DateFormat getCreatedAt() {
        return createdAtDto;
    }

    public void setCreatedAt(DateFormat createdAt) {
        this.createdAtDto = createdAtDto;
    }

    public DateFormat getUpdatedAt() {
        return updatedAtDto;
    }

    public void setUpdatedAt(DateFormat updatedAtDto) {
        this.updatedAtDto = updatedAtDto;
    }

    public Event getEvent() {
        return eventDto;
    }

    public void setEvent(Event event) {
        this.eventDto = eventDto;
    }
}