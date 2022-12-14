package reponsitory;

import modal.TComplex;

import java.util.List;

public interface ITComplexReponsitory {
    List<TComplex> selectAllTComplex();
    boolean delete(String maMB);
}
