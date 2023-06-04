package ru.sstu.busline.controllers.AuthController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import ru.sstu.busline.repositories.AuthRepo;

@CrossOrigin
@RestController
public class AuthController {
    AuthRepo authRepo;
}
