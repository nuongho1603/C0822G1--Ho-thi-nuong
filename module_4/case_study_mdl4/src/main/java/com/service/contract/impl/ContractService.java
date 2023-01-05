package com.service.contract.impl;

import com.model.contract.Contract;
import com.model.dto.ContracDto;
import com.repository.IContractRepository;
import com.service.contract.IContractService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public Page<ContracDto> showList(Pageable pageable) {
//        List<Contract> contractList = iContractRepository.findAll();
//        List<ContracDto> contracDtos = new ArrayList<>();
//        for (Contract con : contractList) {
//            ContracDto contracDto = new ContracDto();
//            BeanUtils.copyProperties(con,contracDto);
//          contracDto.setTotal(iContractRepository.calculator(con.getId()));
//          contracDtos.add(contracDto);
//        }
//        return new PageImpl<>(contracDtos);
        return iContractRepository.showList(pageable);
    }

    @Override
    public List<Contract> findAll() {
        return iContractRepository.findAll();
    }
}
