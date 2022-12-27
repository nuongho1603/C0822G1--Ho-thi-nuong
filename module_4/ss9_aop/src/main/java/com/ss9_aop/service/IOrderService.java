package com.ss9_aop.service;


import com.ss9_aop.model.History;
import com.ss9_aop.model.Library;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    List<Library> findAll();
Library findId(Integer id);
    void save(Library library);
}
