package com.example.dailyplanner.service;

import com.example.dailyplanner.dao.UserRepository;
import com.example.dailyplanner.entity.Product;
import com.example.dailyplanner.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class
UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        User user = null;
        Optional<User> optional = userRepository.findById(id);
        if(optional.isPresent())
            user = optional.get();
        return user;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void addProductToUser(int id, Product product) {
        User user = getUser(id);
        user.getProducts().add(product);
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public boolean checkLoginAndPassword(User user) {
        for (User us : getAllUsers()) {
            if (us.getUsername().equals(user.getUsername()) && us.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
