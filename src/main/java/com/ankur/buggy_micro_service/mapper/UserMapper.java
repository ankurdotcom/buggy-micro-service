package com.ankur.buggy_micro_service.mapper;

import com.ankur.buggy_micro_service.dto.UserDto;
import com.ankur.buggy_micro_service.entity.UserEntity;

public class UserMapper {
    
    public UserEntity toEntity(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDto.getId());
        userEntity.setName(userDto.getName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setRole(userDto.getRole());
        userEntity.setStatus(userDto.getStatus());
        userEntity.setCreated_at(userDto.getCreated_at());
        userEntity.setUpdated_at(userDto.getUpdated_at());
        return userEntity;
    }

    public UserDto toDto(UserEntity userEntity) {
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setName(userEntity.getName());
        userDto.setEmail(userEntity.getEmail());
        userDto.setPassword(userEntity.getPassword());
        userDto.setRole(userEntity.getRole());
        userDto.setStatus(userEntity.getStatus());
        userDto.setCreated_at(userEntity.getCreated_at());
        userDto.setUpdated_at(userEntity.getUpdated_at());
        return userDto;
    }
    
}
