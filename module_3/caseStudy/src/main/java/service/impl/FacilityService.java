package service.impl;

import modal.Facility.Facility;
import reponsitory.IFacilityReponsitory;
import reponsitory.impl.FacilityReponsitory;
import service.IFacilityService;

import java.util.List;

public class FacilityService implements IFacilityService {
    IFacilityReponsitory iFacilityReponsitory = new FacilityReponsitory();
    @Override
    public boolean insertFacility(Facility facility) {
        return iFacilityReponsitory.insertFacility(facility);
    }

    @Override
    public boolean deleteFacility(int id) {
        return iFacilityReponsitory.deleteFacility(id);
    }

    @Override
    public List<Facility> selectAllFacility() {
        return iFacilityReponsitory.selectAllFacility();
    }
}
