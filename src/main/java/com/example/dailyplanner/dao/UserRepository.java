package com.example.dailyplanner.dao;

import com.example.dailyplanner.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
