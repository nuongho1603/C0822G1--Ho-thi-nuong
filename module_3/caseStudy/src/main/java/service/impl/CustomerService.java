package service.impl;

import modal.customer.Customer;
import reponsitory.ICustomerReponsitory;
import reponsitory.impl.CustomerReponsitory;
import service.ICustomerService;

import java.util.List;

public class CustomerService  implements ICustomerService {
ICustomerReponsitory iCustomerReponsitory = new CustomerReponsitory();


    @Override
    public boolean insertCustomer(Customer customer) {

        return iCustomerReponsitory.insertCustomer(customer);
    }

    @Override
    public Customer selectCustomer(int id) {
        return iCustomerReponsitory.selectCustomer(id);
    }

    @Override
    public List<Customer> selectAllCustomer() {
        return iCustomerReponsitory.selectAllCustomer();
    }

    @Override
    public boolean deleteCustomer(int id) {
        return iCustomerReponsitory.deleteCustomer(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return iCustomerReponsitory.updateCustomer(customer);
    }

    @Override
    public List<Customer> searchCustomer(int id) {
        return iCustomerReponsitory.searchCustomer(id);
    }
}
