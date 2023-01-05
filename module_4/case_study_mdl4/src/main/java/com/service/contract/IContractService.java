package com.service.contract;

import com.model.contract.Contract;
import com.model.dto.ContracDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
Page<ContracDto> showList(Pageable pageable);
List<Contract> findAll();

}
