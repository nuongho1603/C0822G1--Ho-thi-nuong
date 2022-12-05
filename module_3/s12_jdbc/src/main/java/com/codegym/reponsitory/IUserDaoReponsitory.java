package com.codegym.reponsitory;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDaoReponsitory {
    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUsers();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    List<User> searchUser(String country);


}
