package ru.sstu.busline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sstu.busline.presentations.views.PathView;

public interface PathViewRepo extends JpaRepository<PathView, Long> {

}
