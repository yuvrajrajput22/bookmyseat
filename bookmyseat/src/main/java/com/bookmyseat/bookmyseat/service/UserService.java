package com.bookmyseat.bookmyseat.service;

import com.bookmyseat.bookmyseat.entity.User;
import com.bookmyseat.bookmyseat.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List <User> getAllUser(){
        return userRepository.findAll();

    }

    public User registerUser(User user)
    {
        return userRepository.save(user);
    }

}
