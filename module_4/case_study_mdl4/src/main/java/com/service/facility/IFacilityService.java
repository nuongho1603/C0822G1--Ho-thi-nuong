package com.service.facility;

import com.model.customer.Customer;
import com.model.facility.Facility;

import java.util.List;
import java.util.Optional;

public interface IFacilityService {
    List<Facility> findAll();
    void save(Facility facility);
    Optional<Facility> findById(int id);
}
