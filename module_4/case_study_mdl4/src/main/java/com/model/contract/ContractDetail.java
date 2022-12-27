package com.model.contract;

import javax.persistence.*;
import java.util.List;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Contract contract;

    @ManyToOne()
    @JoinColumn(name ="attach_facility_id", referencedColumnName = "id")
    private AttachFacility attachFacility;

    private Integer quantity;

    @Column(columnDefinition = "boolean default false")
    private boolean isDeleted;
}
