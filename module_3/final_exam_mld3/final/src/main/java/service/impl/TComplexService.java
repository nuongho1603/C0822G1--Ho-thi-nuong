package service.impl;

import modal.TComplex;
import reponsitory.ITComplexReponsitory;
import reponsitory.impl.TComplexReponsitory;
import service.ITComplexService;

import java.util.List;

public class TComplexService implements ITComplexService {
    ITComplexReponsitory itComplexReponsitory = new TComplexReponsitory();
    @Override
    public List<TComplex> selectAllTComplex() {
        return null;
    }
}
