package com.greatlearning.cfsr.service;

import java.util.List;

import com.greatlearning.cfsr.dto.UserDto;
import com.greatlearning.cfsr.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
