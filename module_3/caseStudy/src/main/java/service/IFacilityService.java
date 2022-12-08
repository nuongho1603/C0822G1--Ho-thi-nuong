package service;

import modal.Facility.Facility;

import java.util.List;

public interface IFacilityService {
    boolean insertFacility(Facility facility);
    boolean deleteFacility(int id);
    List<Facility> selectAllFacility();
}
