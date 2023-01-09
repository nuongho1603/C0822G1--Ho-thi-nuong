package com.service.facility.impl;

import com.model.facility.Facility;
import com.repository.IFacilityRepository;
import com.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository iFacilityRepository;

    @Override
    public List<Facility> findAll() {
        return iFacilityRepository.findAll();
    }

    @Override
    public boolean save(Facility facility) {
        for (int i = 0; i < findAll().size(); i++) {
            if (findAll().get(i).getId() != facility.getId()) {
                if (facility.getName().equals(findAll().get(i).getName())) {
                    return false;
                }
            }
        }
        iFacilityRepository.save(facility);
        return true;
    }

    @Override
    public Facility findById(int id) {
        return iFacilityRepository.findById(id).orElse(null);
    }


    @Override
    public void remove(int id) {
        iFacilityRepository.deleteById(id);
    }

    @Override
    public Page<Facility> searchName(String name, String facilityType, Pageable pageable) {
        return iFacilityRepository.searchName(name, facilityType, pageable);
    }
}
