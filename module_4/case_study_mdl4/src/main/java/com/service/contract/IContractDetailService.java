package com.service.contract;


import com.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService{
    List<ContractDetail> findAll();

    void addContractDetail(ContractDetail contractDetail);

}
