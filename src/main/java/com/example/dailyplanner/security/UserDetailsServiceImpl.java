//package com.example.dailyplanner.security;
//
//import com.example.dailyplanner.dao.UserRepository;
//import com.example.dailyplanner.entity.User;
//import com.example.dailyplanner.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service("userDetailServiceImpl")
//public class UserDetailsServiceImpl implements UserDetailsService {
//    private final UserService userService;
//
//    @Autowired
//    public UserDetailsServiceImpl(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = null;
//        Optional<User> optional = userService.findUserByUsername(username);
//        if(optional.isPresent())
//            user = optional.get();
//        return SecurityUser.fromUser(user);
//    }
//}
