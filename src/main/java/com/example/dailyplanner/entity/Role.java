package com.example.dailyplanner.entity;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.*;
import java.util.stream.Collectors;

public enum Role {
    USER,
    ADMIN
//    USER(Arrays.asList(Permission.USERS_READ)),
//    ADMIN(Arrays.asList(Permission.USERS_WRITE, Permission.USERS_READ));
//
//    private final List<Permission> permissions;
//
//    Role(List<Permission> permissions) {
//        this.permissions = permissions;
//    }
//
//    public List<Permission> getPermissions() {
//        return permissions;
//    }
//
//    public List<SimpleGrantedAuthority> getAuthorities() {
//        return getPermissions().stream()
//                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
//                .collect(Collectors.toList());
//    }
}
