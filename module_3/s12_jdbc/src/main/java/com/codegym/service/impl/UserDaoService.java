package com.codegym.service.impl;

import com.codegym.model.User;
import com.codegym.reponsitory.IUserDaoReponsitory;
import com.codegym.reponsitory.impl.UserDaoReponsitory;
import com.codegym.service.IUserDaoService;

import java.sql.SQLException;
import java.util.List;

public class UserDaoService implements IUserDaoService {
  static  IUserDaoReponsitory userDaoReponsitory = new UserDaoReponsitory();
    @Override
    public boolean insertUser(User user) throws SQLException {
        userDaoReponsitory.insertUser(user);
        return false;
    }

    @Override
    public User selectUser(int id) {
        return userDaoReponsitory.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userDaoReponsitory.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userDaoReponsitory.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userDaoReponsitory.updateUser(user);
    }

    @Override
    public List<User> searchUser(String country) {
        return userDaoReponsitory.searchUser(country);
    }

//    @Override
//    public boolean delete(int deleteId) {
//        return false;
//    }
}
