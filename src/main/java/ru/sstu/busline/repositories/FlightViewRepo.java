package ru.sstu.busline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.sstu.busline.presentations.views.FlightView;

import java.util.List;

@Repository
public interface FlightViewRepo extends JpaRepository<FlightView, Long> {
    @Query("SELECT f FROM FlightView f WHERE f.id_from_point = :idFromPoint AND f.id_to_point = :idToPoint")
    List<FlightView> findByPoints(Long idFromPoint, Long idToPoint);

}