package reponsitory;

import modal.customer.Customer;

import java.util.List;

public interface ICustomerReponsitory {
    boolean insertCustomer(Customer customer);
    Customer selectCustomer(int id);
    List<Customer> selectAllCustomer();
    boolean deleteCustomer(int id);
    boolean updateCustomer(Customer customer);
    List<Customer> searchCustomer(String name, String address, int gender);

}
