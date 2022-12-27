package com.ss9_aop.service;

import com.ss9_aop.model.History;
import com.ss9_aop.repository.IHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService implements IHistoryService{
    @Autowired
    private IHistoryRepository iHistoryRepository;
    @Override
    public List<History> findAll() {
        return iHistoryRepository.findAll();
    }

    @Override
    public void save(History history) {
        iHistoryRepository.save(history);
    }

    @Override
    public History findBookCode(int bookCode) {
        return iHistoryRepository.findByOtp(bookCode);
    }
}
