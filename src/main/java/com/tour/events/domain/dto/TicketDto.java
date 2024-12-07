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
    private EventSaveDto eventSaveDto;

//    private int availableQuantity;

    public int getIdDto() {
        return idDto;
    }

    public void setIdDto(int idDto) {
        this.idDto = idDto;
    }

    public Boolean getStatusDto() {
        return statusDto;
    }

    public void setStatusDto(Boolean statusDto) {
        this.statusDto = statusDto;
    }

    public String getTypeDto() {
        return typeDto;
    }

    public void setTypeDto(String typeDto) {
        this.typeDto = typeDto;
    }

    public Float getPriceDto() {
        return priceDto;
    }

    public void setPriceDto(Float priceDto) {
        this.priceDto = priceDto;
    }

    public Integer getNumberDto() {
        return numberDto;
    }

    public void setNumberDto(Integer numberDto) {
        this.numberDto = numberDto;
    }

    public Boolean getPresaleDto() {
        return presaleDto;
    }

    public void setPresaleDto(Boolean presaleDto) {
        this.presaleDto = presaleDto;
    }

    public EventSaveDto getEventSaveDto() {
        return eventSaveDto;
    }

    public void setEventSaveDto(EventSaveDto eventSaveDto) {
        this.eventSaveDto = eventSaveDto;
    }


}