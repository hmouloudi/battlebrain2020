package com.sqli.seatservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class SeatDto {
    private int floor;
    private String area;
    private String room;
    private String desk;
    private String seatNumber;

}
