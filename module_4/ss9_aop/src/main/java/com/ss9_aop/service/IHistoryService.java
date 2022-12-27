package com.ss9_aop.service;

import com.ss9_aop.model.History;

import java.util.List;

public interface IHistoryService {
    List<History> findAll();
    void save(History history);
    History findBookCode(int bookCode);
}
