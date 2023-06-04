package ru.sstu.busline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sstu.busline.presentations.models.Path;

@Repository
public interface PathRepo extends JpaRepository<Path, Long> {

}