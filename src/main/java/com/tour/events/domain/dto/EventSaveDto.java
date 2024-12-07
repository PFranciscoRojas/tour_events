package com.tour.events.domain.dto;

import java.util.Date;

public class EventSaveDto {
    private int idDto;
    private String nameDto;
    private String descriptionDto;
    private String locationDto;
    private Date startDto;
    private Date finishDto;
    private Integer ageRestrictionDto;
    private Integer capacityDto;
    private Integer availabilityDto;
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
