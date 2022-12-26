package com.service.facility.impl;

import com.model.facility.RentType;
import com.repository.IRentTypeRepository;
import com.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {
    @Autowired
    private IRentTypeRepository iRentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return iRentTypeRepository.findAll();
    }
}
