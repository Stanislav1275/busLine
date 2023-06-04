//package ru.sstu.busline.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Service;
//import ru.sstu.busline.presentations.models.User;
//import ru.sstu.busline.repositories.AuthRepo;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.springframework.http.ResponseEntity.ok;
//
//@Service
//
//public class AuthService {
//    @Autowired
//    AuthRepo authRepo;
//    public List<User> getAllUsers(){
//        return authRepo.findAll();
//    }
//    public List<User> getUserById(@Param("id") Long id){
//        return authRepo.findUserById(id);
//    }
//    public List<User> getUsersByRangId(@Param("rangid") Long rangid){
//        return authRepo.findUsersByRangid(rangid);
//    }
//}
