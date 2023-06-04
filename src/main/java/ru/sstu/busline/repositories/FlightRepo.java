package ru.sstu.busline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.sstu.busline.presentations.models.Flight;
import ru.sstu.busline.presentations.models.Path;

import java.util.List;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {
    @Query(name = "Flight.findByPathId")
    List<Flight> findByPathId(@Param("pathId") int id_path);

}