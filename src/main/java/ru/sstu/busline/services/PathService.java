package ru.sstu.busline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sstu.busline.presentations.models.Path;
import ru.sstu.busline.presentations.views.PathView;
import ru.sstu.busline.repositories.PathRepo;
import ru.sstu.busline.repositories.PathViewRepo;

import java.util.List;

@Service
public class PathService {
    @Autowired
    PathRepo pathRepo;
    @Autowired
    PathViewRepo pathViewRepo;

    public List<Path> listAllPaths(){
        return pathRepo.findAll();
    }
    public List<PathView> listAllPathsViews(){
        return pathViewRepo.findAll();
    }

}
