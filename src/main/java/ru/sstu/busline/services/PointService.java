package ru.sstu.busline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sstu.busline.presentations.models.Point;
import ru.sstu.busline.repositories.PointRepo;

import java.util.List;

@Service
public class PointService {
    @Autowired
    PointRepo pointRepo;

    public List<Point> listAllPont(){
        return pointRepo.findAll();
    }


}
