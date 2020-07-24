package com.sqli.seatservice.domain.table;


import com.sqli.seatservice.domain.room.Room;
import com.sqli.seatservice.domain.seat.Seat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@javax.persistence.Table(name = "desks")
@Builder
@Entity
public class Desk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    @Column(name = "desk_code", unique = true)
    private String code;

    @ManyToOne
    private Room room;

    @OneToMany(mappedBy = "desk", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Seat> seats;

    @Column(name = "desk_size")
    private int size;
}
