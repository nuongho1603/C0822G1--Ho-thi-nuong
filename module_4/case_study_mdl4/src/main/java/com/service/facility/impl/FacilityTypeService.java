package com.service.facility.impl;

import com.model.facility.FacilityType;
import com.repository.ICustomerTypeReponsitory;
import com.repository.IFacilityTypeRepository;
import com.service.facility.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeService implements IFacilityTypeService {
    @Autowired
    private IFacilityTypeRepository iFacilityTypeRepository;
    @Override
    public List<FacilityType> findAll() {
        return iFacilityTypeRepository.findAll();
    }
}
