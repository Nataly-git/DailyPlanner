//package com.example.dailyplanner.security;
//
//import com.example.dailyplanner.entity.User;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//
//@Data
//@AllArgsConstructor
//public class SecurityUser implements UserDetails {
//
//    private final String username;
//    private final String password;
//    private final List<SimpleGrantedAuthority> authorities;
//    private final boolean isActive;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//
//    public static UserDetails fromUser(User user) {
//        return new org.springframework.security.core.userdetails.User(
//                user.getUsername(), user.getPassword(),
//                user.isActive() == true,
//                user.isActive() == true,
//                user.isActive() == true,
//                user.isActive() == true,
//                user.getRole().
//        );
//    }
//}
