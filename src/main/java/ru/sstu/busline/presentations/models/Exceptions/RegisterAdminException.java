package ru.sstu.busline.presentations.models.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterAdminException extends RuntimeException {
    public RegisterAdminException(String message) {
        super(message);
    }

    public RegisterAdminException(String message, Throwable cause) {
        super(message, cause);
    }

}
