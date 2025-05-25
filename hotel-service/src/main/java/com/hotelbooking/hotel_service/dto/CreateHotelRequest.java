package com.hotelbooking.hotel_service.dto;

import lombok.Data;

@Data
public class CreateHotelRequest {
    private String name;
    private String city;
    private String address;
    private String description;
    private Float rating;
}
