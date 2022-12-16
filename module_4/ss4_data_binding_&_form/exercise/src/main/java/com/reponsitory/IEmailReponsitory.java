package com.reponsitory;

import com.modal.Email;

import java.util.List;

public interface IEmailReponsitory {
    List<Email> selectAllEmail();
    Email selectById(int id);
    void update(Email email,int id);
}
