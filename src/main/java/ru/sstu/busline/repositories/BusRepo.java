package ru.sstu.busline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sstu.busline.presentations.models.Bus;
import ru.sstu.busline.presentations.models.Flight;

@Repository
public interface BusRepo extends JpaRepository<Bus, Long> {

}