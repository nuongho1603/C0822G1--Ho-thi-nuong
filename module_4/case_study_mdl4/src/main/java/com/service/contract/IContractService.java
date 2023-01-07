package com.service.contract;

import com.model.contract.Contract;

import com.model.dto.IAttachFacilityDto;
import com.model.dto.IContractDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
Page<IContractDto> showList(Pageable pageable);
List<Contract> findAll();
void add(Contract contract);


    List<IAttachFacilityDto> listAttachFacility(int id);
}
