package com.ankur.buggy_micro_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankur.buggy_micro_service.dto.UserDto;
import com.ankur.buggy_micro_service.entity.UserEntity;
import com.ankur.buggy_micro_service.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDto getUserById(Long id) {
        Optional<UserEntity> userEntity =  userRepository.findById(id).get();
    }
}
