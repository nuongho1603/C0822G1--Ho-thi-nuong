package com.service;

import com.modal.Email;
import com.reponsitory.EmailReponsitory;
import com.reponsitory.IEmailReponsitory;

import java.util.List;

public class EmailService implements IEmailService{
    IEmailReponsitory iEmailReponsitory = new EmailReponsitory();
    @Override
    public List<Email> selectAllEmail() {
        return iEmailReponsitory.selectAllEmail();
    }

    @Override
    public Email selectById(int id) {
        return iEmailReponsitory.selectById(id);
    }

    @Override
    public void update(Email email, int id) {
        iEmailReponsitory.update(email,id);
    }



}
