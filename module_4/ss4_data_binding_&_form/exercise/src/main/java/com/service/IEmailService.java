package com.service;

import com.modal.Email;

import java.util.List;

public interface IEmailService {
    List<Email> selectAllEmail();

    Email selectById(int id);
    void update(Email email,int id);
}
