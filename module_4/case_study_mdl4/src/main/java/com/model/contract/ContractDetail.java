package com.model.contract;

import javax.persistence.*;

@Entity
public class ContractDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int quantity;
    @ManyToOne
    private Contract contract;
    @ManyToOne
    private AttachFacility facilitySet;

    public AttachFacility getFacilitySet() {
        return facilitySet;
    }

    public void setFacilitySet(AttachFacility facilitySet) {
        this.facilitySet = facilitySet;
    }



    public ContractDetail() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

}
