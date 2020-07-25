package com.sqli.seatservice.domain.seat;

import com.sqli.seatservice.domain.desk.Desk;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "seats", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"seat_number", "desk_pk"})
})
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    @ManyToOne
    private Desk desk;

    @Column(name = "seat_number")
    private String number;
}
