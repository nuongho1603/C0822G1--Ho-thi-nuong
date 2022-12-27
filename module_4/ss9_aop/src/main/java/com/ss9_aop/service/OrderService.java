package com.ss9_aop.service;

import com.ss9_aop.model.Library;
import com.ss9_aop.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderRepository iOrderRepository;
    @Override
    public List<Library> findAll() {
        return iOrderRepository.findAll();
    }

    @Override
    public Library findId(Integer id) {
        return iOrderRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Library library) {
        iOrderRepository.save(library);
    }


}
