package com.tour.events.domain.dto;

import com.tour.events.infraestructure.entities.Event;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Min;



import java.text.DateFormat;

public class TicketDto {

    private int idDto;

    @NotNull(message = "El estado no puede ser nulo")
    private Boolean statusDto;

    @NotBlank(message = "El tipo no puede estar en blanco")
    private String typeDto;

    @NotNull(message = "El precio no puede ser nulo")
    @Positive(message = "El precio debe ser un número positivo")
    private Float priceDto;

    @NotNull(message = "El número no puede ser nulo")
    @Positive(message = "El número debe ser mayor que 0")
    private Integer numberDto;

    @NotNull(message = "La pre-venta no puede ser nula")
    private Boolean presaleDto;

    private EventSaveDto eventSaveDto;

    // Getters y Setters

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