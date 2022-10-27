package FuramaResorts.Service;

import FuramaResorts.Models.Customer;

public interface ICustomerManagementService {
    void displayCustomer();

    Customer addCustomer();

    void editCustomer();
}
