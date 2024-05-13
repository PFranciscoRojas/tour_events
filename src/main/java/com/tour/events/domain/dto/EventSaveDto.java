package com.tour.events.domain.dto;

import java.util.Date;

public class EventSaveDto {
    private int idDto;
    private String nameDto;
    private String descriptionDto;
    private String locationDto;
    private Date startDto;
    private Date finishDto;
    private int ageRestrictionDto;
    private int capacityDto;
    private int availabilityDto;
    private String typeDto;
    private String cityDto;
    private String addressDto;

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

    public String getDescriptionDto() {
        return descriptionDto;
    }

    public void setDescriptionDto(String descriptionDto) {
        this.descriptionDto = descriptionDto;
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

    public int getAgeRestrictionDto() {
        return ageRestrictionDto;
    }

    public void setAgeRestrictionDto(int ageRestrictionDto) {
        this.ageRestrictionDto = ageRestrictionDto;
    }

    public int getCapacityDto() {
        return capacityDto;
    }

    public void setCapacityDto(int capacityDto) {
        this.capacityDto = capacityDto;
    }

    public int getAvailabilityDto() {
        return availabilityDto;
    }

    public void setAvailabilityDto(int availabilityDto) {
        this.availabilityDto = availabilityDto;
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
}
