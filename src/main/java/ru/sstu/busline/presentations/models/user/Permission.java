package ru.sstu.busline.presentations.models.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),
    ADMIN_DELETE("admin:delete"),
    MANAGERAB_READ("management:read"),
    MANAGERAB_UPDATE("management:update"),
    MANAGERAB_CREATE("management:create"),
    MANAGERAB_DELETE("management:delete");


    @Getter
    private final String permission;
}
