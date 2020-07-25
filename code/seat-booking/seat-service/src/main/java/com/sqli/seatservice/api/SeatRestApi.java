package com.sqli.seatservice.api;

import com.sqli.seatservice.domain.seat.SeatRepository;
import com.sqli.seatservice.dto.SeatDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class SeatRestApi {

    private final SeatRepository seatRepository;

    @GetMapping("/seats")
    public List<SeatDto> getSeats() {
        List<SeatDto> seats = new ArrayList<>();
        seatRepository.findAll().forEach(seat -> {
            SeatDto seatDto = SeatDto.builder()
                    .floor(seat.getDesk().getRoom().getArea().getFloor().getNumber())
                    .area(seat.getDesk().getRoom().getArea().getCode())
                    .room(seat.getDesk().getRoom().getName())
                    .desk(seat.getDesk().getCode())
                    .seatNumber(seat.getNumber())
                    .build();
            seats.add(seatDto);
        });
        return seats;
    }
}
