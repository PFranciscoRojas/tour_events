package com.tour.events.domain.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.Date;

public class EventSaveDto {
    private int idDto;

    @NotBlank(message = "El nombre no puede estar en blanco")
    private String nameDto;

    private String descriptionDto;

    @NotBlank(message = "La ubicación no puede estar en blanco")
    private String locationDto;

    @NotNull(message = "La fecha de inicio no puede ser nula")
    @Future(message = "La fecha de inicio debe ser en el futuro")
    private Date startDto;

    @NotNull(message = "La fecha de finalización no puede ser nula")
    @Future(message = "La fecha de finalización debe ser en el futuro")
    private Date finishDto;

    private Integer ageRestrictionDto;

    @NotNull(message = "La capacidad no puede ser nula")
    @PositiveOrZero(message = "La capacidad debe ser un número positivo o cero")
    private Integer capacityDto;

    @NotNull(message = "La disponibilidad no puede ser nula")
    @PositiveOrZero(message = "La disponibilidad debe ser un número positivo o cero")
    private Integer availabilityDto;;
    private String typeDto;
    private String cityDto;
    private String addressDto;

    public String getDescriptionDto() {
        return descriptionDto;
    }

    public void setDescriptionDto(String descriptionDto) {
        this.descriptionDto = descriptionDto;
    }

    public Integer getAgeRestrictionDto() {
        return ageRestrictionDto;
    }

    public void setAgeRestrictionDto(Integer ageRestrictionDto) {
        this.ageRestrictionDto = ageRestrictionDto;
    }

    public Integer getCapacityDto() {
        return capacityDto;
    }

    public void setCapacityDto(Integer capacityDto) {
        this.capacityDto = capacityDto;
    }

    public String getTypeDto() {
        return typeDto;
    }

    public void setTypeDto(String typeDto) {
        this.typeDto = typeDto;
    }

    public String getCityDto() {
        return cityDto;
    }

    public void setCityDto(String cityDto) {
        this.cityDto = cityDto;
    }

    public String getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(String addressDto) {
        this.addressDto = addressDto;
    }

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
}
