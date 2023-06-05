package ru.sstu.busline.presentations.models.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static ru.sstu.busline.presentations.models.user.Permission.*;


@RequiredArgsConstructor
public enum Role {

  USER(Collections.emptySet()),
  ADMIN(
          Set.of(
                  ADMIN_READ,
                  ADMIN_UPDATE,
                  ADMIN_DELETE,
                  ADMIN_CREATE,
                  MANAGERAB_READ,
                  MANAGERAB_UPDATE,
                  MANAGERAB_DELETE,
                  MANAGERAB_CREATE
          )
  ),
  MANAGERAB(
          Set.of(
                  MANAGERAB_READ,
                  MANAGERAB_UPDATE,
                  MANAGERAB_DELETE,
                  MANAGERAB_CREATE
          )
  );

  @Getter
  private final Set<Permission> permissions;

  public List<SimpleGrantedAuthority> getAuthorities() {
    var authorities = getPermissions()
            .stream()
            .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
            .collect(Collectors.toList());
    authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
    return authorities;
  }
}
