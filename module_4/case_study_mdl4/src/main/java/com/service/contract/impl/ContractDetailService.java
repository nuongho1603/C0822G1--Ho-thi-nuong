package com.service.contract.impl;

import com.model.contract.ContractDetail;
import com.repository.IContractDetailRepository;
import com.repository.IContractRepository;
import com.service.contract.IContractDetailService;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    private IContractDetailRepository iContractDetailRepository;
    @Override
    public List<ContractDetail> findAll() {
        return iContractDetailRepository.findAll();
    }
}
