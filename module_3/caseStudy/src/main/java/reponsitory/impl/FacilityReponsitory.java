package reponsitory.impl;

import modal.Facility.Facility;
import modal.Facility.FacilityTypeID;
import modal.Facility.RentType;
import reponsitory.BaseReponsitory;
import reponsitory.IFacilityReponsitory;
import sun.security.krb5.internal.crypto.HmacSha1Aes128CksumType;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacilityReponsitory implements IFacilityReponsitory {
    private static final String SELECT_ALL_FACILITY = "select f.*,ft.name as facility_type_name,rt.name as rent_type_name from facility as f left join rent_type as rt on f.rent_type_id = rt.id\n" +
            " join facility_type as ft on f.facility_type_id = ft.id;";
    private static final String DELETE_FACILITY = "delete from facility where id=?;";

    @Override
    public boolean insertFacility(Facility facility) {
        return false;
    }

    @Override
    public boolean deleteFacility(int id) {
        Connection connection = BaseReponsitory.getConnection();
        boolean rowDelte = false;
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_FACILITY);
            statement.setInt(1,id);
            rowDelte = statement.executeUpdate()>0;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowDelte;
    }

    @Override
    public List<Facility> selectAllFacility() {
        List<Facility> facilityList = new ArrayList<>();
        Connection connection = BaseReponsitory.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FACILITY);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int area = rs.getInt("area");
                double cost = rs.getDouble("cost");
                int maxPeople = rs.getInt("max_people");
                String standardRoom = rs.getString("standard_room");
                String descriptionOtherConvenience = rs.getString("description_other_convenience");
                double poolArea = rs.getDouble("pool_area");
                int numberOfFloor = rs.getInt("number_of_floors");
                String facilityFree = rs.getString("facility_free");

                int facilityId = rs.getInt("id");
                String facilityName = rs.getString("name");

                int rentTypeId = rs.getInt("id");
                String rentTypeName = rs.getString("name");

                FacilityTypeID facilityTypeId = new FacilityTypeID(facilityId, facilityName);
                RentType rentType = new RentType(rentTypeId,rentTypeName);
                Facility facility = new Facility(id, name, area, cost, maxPeople, standardRoom, descriptionOtherConvenience, poolArea, numberOfFloor, facilityFree,facilityTypeId, rentType);
                facilityList.add(facility);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return facilityList;
    }
}
