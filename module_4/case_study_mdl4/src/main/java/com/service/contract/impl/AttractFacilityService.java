package com.service.contract.impl;

import com.model.contract.AttachFacility;
import com.repository.IAttractFacilityRepository;
import com.service.contract.IAttractFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractFacilityService implements IAttractFacilityService {
    @Autowired
    private IAttractFacilityRepository iAttractFacilityRepository;
    @Override
    public List<AttachFacility> findAll() {
        return iAttractFacilityRepository.findAll();
    }
}
