package com.model.contract;

import com.model.customer.Customer;
import com.model.employee.Employee;
import com.model.facility.Facility;

import javax.persistence.*;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String startDate;
    private String endDate;
    private Double deposit;
    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "facility_id",referencedColumnName = "id")
    private Facility facility;

    @OneToOne(mappedBy = "contract")
    private ContractDetail contractDetail;
}
