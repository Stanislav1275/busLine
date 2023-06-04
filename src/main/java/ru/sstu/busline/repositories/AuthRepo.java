package ru.sstu.busline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sstu.busline.presentations.models.Bus;
import ru.sstu.busline.presentations.models.User;

import java.util.List;

@Repository
public interface AuthRepo extends JpaRepository<User, Long> {
    List<User> findUsersByRangid(Long rangid);
    List<User> findUserById(Long id);
}