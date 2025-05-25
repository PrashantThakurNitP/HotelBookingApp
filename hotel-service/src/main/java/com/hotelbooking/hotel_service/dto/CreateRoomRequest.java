package com.hotelbooking.hotel_service.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class CreateRoomRequest {
    private UUID hotelId;
    private String roomType;
    private BigDecimal price;
    private Boolean available;
}
