package ru.sstu.busline.controllers.BusController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sstu.busline.presentations.models.Flight;
import ru.sstu.busline.presentations.models.Path;
import ru.sstu.busline.presentations.models.Point;
import ru.sstu.busline.presentations.views.FlightView;
import ru.sstu.busline.presentations.views.PathView;
import ru.sstu.busline.services.FlightService;
import ru.sstu.busline.services.PathService;
import ru.sstu.busline.services.PointService;

import java.util.List;

@CrossOrigin
@RestController
public class BusController {
    @Autowired
    private PointService pointService;
    @Autowired
    private PathService pathService;
    @Autowired
    private FlightService flightService;

    @GetMapping("/points")
    public ResponseEntity<List<Point>> getAllPoints(){

            return ResponseEntity.ok(pointService.listAllPont());
    }
    @GetMapping("/paths")
    public ResponseEntity<List<Path>> getAllPaths(){
        return ResponseEntity.ok(pathService.listAllPaths());
    }
    @GetMapping("/pathsviews")
    public ResponseEntity<List<PathView>> getAllPathsViews(){
        return ResponseEntity.ok(pathService.listAllPathsViews());
    }
    @GetMapping("/flights")
    public ResponseEntity<List<Flight>> getAllFlights(){
        return ResponseEntity.ok(flightService.listAllFlights());
    }
    @GetMapping("/flightsByPath")
    public ResponseEntity<List<Flight>> getFlightsByPath(@RequestParam("id") int id){
        return ResponseEntity.ok(flightService.getFlightsByPath(id));
    }
    @GetMapping("/flightsviews")
    public ResponseEntity<List<FlightView>> getAllFlightsViews(){
        return ResponseEntity.ok(flightService.getAllFlightsViews());
    }
    @GetMapping("/flightsByPoints")
    public ResponseEntity<List<FlightView>> getFlightByPoints(@RequestParam("from") Long id_from_point, @RequestParam("to") Long id_to_point){
        return ResponseEntity.ok(flightService.getFlightsByPoints(id_from_point, id_to_point));
    }
}
