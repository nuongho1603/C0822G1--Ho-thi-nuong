package com.repository;

import com.model.contract.Contract;

import com.model.dto.IAttachFacilityDto;
import com.model.dto.IContractDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IContractRepository extends JpaRepository<Contract, Integer> {
//    @Query(value = "select ifnull(sum(f.cost+af.cost*cd.quantity),0) as total from `contract` c left join `contract_detail` cd on c.id = cd.contract_id\n" +
//            "left join `attach_facility` af on af.id = cd.facility_set_id left join facility f on c.facility_id = f.id\n" +
//            "where c.id = :contractId group by c.id",nativeQuery = true)
//    Double calculator(@Param("contractId") int contracId);
//
//    @Query(value = "select * from contract",nativeQuery = true)

    @Query(value = "select c.id, f.`name` as nameFacility, cus.`name` as nameCustomer, c.start_date as startDate, c.end_date as endDate, c.deposit, ifnull(f.cost,0) + sum(ifnull(af.cost * cd.quantity,0)) as total from `customer` cus join `contract` c on c.customer_id=cus.id join `facility` f on f.id= c.facility_id left join `attach_facility` af on af.id=c.id left join `contract_detail` cd on cd.contract_id = c.id group by c.id, cus.id order by c.id",nativeQuery = true)
    Page<IContractDto> showList(Pageable pageable);

    @Query(value = "select contract.id,af.name,af.cost,af.unit,af.status, sum(cd.quantity) as sumQuantity, (af.cost * sum(cd.quantity)) as sumMoney from contract join contract_detail cd on contract.id = cd.contract_id join attach_facility af on af.id = cd.facility_set_id where contract.id=:id group by af.id,contract.id;", nativeQuery = true)
    List<IAttachFacilityDto> listAttachFacility(@Param("id") int id);
}
