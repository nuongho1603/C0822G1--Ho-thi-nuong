package com.service;

import com.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    void save(User user);
}
