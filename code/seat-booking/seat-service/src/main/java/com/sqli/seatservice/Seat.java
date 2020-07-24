package com.sqli.seatservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Builder
public class Seat {
    @Id
    private String id;
    private String area;
    private String floor;
    private String number;
}
