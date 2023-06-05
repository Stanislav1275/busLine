package ru.sstu.busline.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.sstu.busline.presentations.models.Exceptions.AuthException;
import ru.sstu.busline.presentations.models.Exceptions.RegisterAdminException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
    }
    @ExceptionHandler(AuthException.class)
    @ResponseBody
    public ResponseEntity<String> handleCustomException(AuthException ex) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("USER IS NOT");
    }
    @ExceptionHandler(RegisterAdminException.class)
    @ResponseBody
    public ResponseEntity<String> handleCustomException(RegisterAdminException ex) {

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }




}