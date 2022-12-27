package com.model.contract;

import javax.persistence.*;
import java.util.List;

@Entity
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double cost;
    private String unit;
    private String status;

    @Column(columnDefinition = "boolean default false")
    private boolean isDeleted;

    @OneToMany(mappedBy = "attachFacility")
    private List<ContractDetail> contractDetailList;
}
