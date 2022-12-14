package service;

import modal.TComplex;

import java.util.List;

public interface ITComplexService {
    List<TComplex> selectAllTComplex();
    boolean delete(String maMB);
}
