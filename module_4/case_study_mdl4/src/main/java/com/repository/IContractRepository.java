package com.repository;

import com.model.contract.Contract;
import com.model.dto.ContracDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface IContractRepository extends JpaRepository<Contract, Integer> {
    @Query(value = "select c.id,f.name,c.name,ifnull(sum(f.cost+af.cost*cd.quantity),0) as total from `contract` c left join `contract_detail` cd on c.id = cd.contract_id\n" +
            "left join `attach_facility` af on af.id = cd.facility_set_id left join facility f on c.facility_id = f.id\n" +
            "where c.id = :contractId group by c.id",nativeQuery = true)
    Double calculator(@Param("contractId") int contracId);

    @Query(value = "select * from contract",nativeQuery = true)
    Page<ContracDto> showList(Pageable pageable);
}
