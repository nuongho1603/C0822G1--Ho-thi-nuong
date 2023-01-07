package com.service.contract;


import com.model.contract.AttachFacility;

import java.util.List;

public interface IAttractFacilityService {
List<AttachFacility> findAll();
AttachFacility findById(int id);
}
