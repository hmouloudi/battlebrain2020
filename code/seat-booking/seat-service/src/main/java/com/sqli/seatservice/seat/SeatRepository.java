package com.sqli.seatservice.seat;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "seat", path = "seat")
public interface SeatRepository extends CrudRepository<Seat, Long> {
}
