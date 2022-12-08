package reponsitory;

import modal.Facility.Facility;

import java.util.List;

public interface IFacilityReponsitory {
    boolean insertFacility(Facility facility);
    boolean deleteFacility(int id);
    List<Facility> selectAllFacility();

}
