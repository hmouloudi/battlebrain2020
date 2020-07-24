package com.sqli.seatservice.domain.area;

import com.sqli.seatservice.domain.floor.Floor;
import com.sqli.seatservice.domain.room.Room;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "areas", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"area_code", "floor_pk"})
})
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    @Column(name = "area_code")
    private String code;

    @ManyToOne
    private Floor floor;

    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Room> rooms;
}
