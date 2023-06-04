package ru.sstu.busline.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sstu.busline.presentations.models.Flight;
import ru.sstu.busline.presentations.views.FlightView;
import ru.sstu.busline.repositories.FlightRepo;
import ru.sstu.busline.repositories.FlightViewRepo;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepo flightRepo;
    @Autowired
    FlightViewRepo flightViewRepo;
    public List<Flight> listAllFlights(){
        return flightRepo.findAll();
    }
    public List<Flight> getFlightsByPath(int id){
            return flightRepo.findByPathId(id);


    }
    public List<FlightView> getAllFlightsViews(){
        return flightViewRepo.findAll();
    }
    public List<FlightView> getFlightsByPoints(Long id_from_point, Long id_to_point){
        return flightViewRepo.findByPoints(id_from_point, id_to_point);
    }

}
