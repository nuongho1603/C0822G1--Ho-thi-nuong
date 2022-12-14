package reponsitory.impl;

import com.sun.org.apache.bcel.internal.generic.NEW;
import modal.TComplex;
import reponsitory.BaseReponsitory;
import reponsitory.ITComplexReponsitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TComplexReponsitory implements ITComplexReponsitory {
    private static String SELECT_ALL_TCOMPLEX = "select* from mat_bang_tcomplex;";
    private static String DELETE_BY_MA = "delete from mat_bang_tcomplex where ma_mb = ?;";

    @Override
    public List<TComplex> selectAllTComplex() {
        List<TComplex> tComplexList = new ArrayList<>();
        Connection connection = BaseReponsitory.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TCOMPLEX);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String maMB = rs.getString("ma_mb");
                int dienTich = rs.getInt("dien_tich");
                String trangThai = rs.getString("trang_thai");
                int tang = rs.getInt("tang");
                String loaiVanPhong = rs.getString("loai_van_phong");
                String moTaChiTiet = rs.getString("mo_ta_chi_tiet");
                int gia = rs.getInt("gia");
                String ngayBatDau = rs.getString("ngay_bat_dau");
                String ngayKetThuc = rs.getString("ngay_ket_thuc");
                TComplex tComplex = new TComplex(maMB, dienTich, trangThai, tang, loaiVanPhong, moTaChiTiet, gia, ngayBatDau, ngayKetThuc);
                tComplexList.add(tComplex);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tComplexList;
    }

    @Override
    public boolean delete(String maMB) {
        Connection connection = BaseReponsitory.getConnection();
        boolean rowDelete = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_MA);
            preparedStatement.setString(1, maMB);
            rowDelete = preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowDelete;
    }

}
