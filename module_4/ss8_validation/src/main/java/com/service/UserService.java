package com.service;

import com.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
private IUserService iUserService;
    @Override
    public List<User> findAll() {
        return iUserService.findAll();
    }

    @Override
    public void save(User user) {
        iUserService.save(user);
    }
}
