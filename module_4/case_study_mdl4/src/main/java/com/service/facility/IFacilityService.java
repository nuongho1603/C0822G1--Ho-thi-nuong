package com.service.facility;

import com.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IFacilityService {
    List<Facility> findAll();

    boolean save(Facility facility);

    Facility findById(int id);

    void remove(int id);

    Page<Facility> searchName(String name, String facilityType, Pageable pageable);


}
