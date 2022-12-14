package reponsitory.impl;

import modal.customer.Customer;
import modal.customer.CustomerType;
import reponsitory.BaseReponsitory;
import reponsitory.ICustomerReponsitory;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerReponsitory implements ICustomerReponsitory {

    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer" + "  (name, date_of_birthday,gender,id_card,phone_number,email,address,customer_type_id) VALUES " +
            " (?,?,?,?,?,?,?,?);";

    private static final String SELECT_CUSTOMER_BY_ID = "select name, date_of_birthday,gender,id_card,phone_number,email,address,customer_type_id from customer where id =?";
    private static final String SELECT_ALL_CUSTOMER = " select c.*,ct.name as customer_type_name from customer as c left join customer_type as ct on c.customer_type_id = ct.id;";
    private static final String DELETE_CUSTOMER_SQL = "delete from customer where id = ?;";
    private static final String UPDATE_CUSTOMER_SQL = "update customer set name =?,date_of_birthday=?,gender=?,id_card=?,phone_number=?,email=?,address =?,customer_type_id=? where id = ?;";
    private static final String SEARCH_CUSTOMER_SQL = "select * from customer\n" +
            "where gender = ? AND ( ? is null OR name like ?) AND ( ? is null OR address like ?);";
//    private static final String DELETE_BY_ID = "call delete_by_id(?);";
//    private final String


    @Override
    public boolean insertCustomer(Customer customer) {
        Connection connection = BaseReponsitory.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getBirthday());
            preparedStatement.setInt(3, customer.getGender());
            preparedStatement.setInt(4, customer.getIdCard());
            preparedStatement.setInt(5, customer.getPhone());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.setInt(8, customer.getCustomerType().getId());
            System.out.println(preparedStatement);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public Customer selectCustomer(int id) {
        Customer customer = null;
        Connection connection = BaseReponsitory.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String birthday = rs.getString("date_of_birthday");
                int gender = rs.getInt("gender");
                int idCard = rs.getInt("id_card");
                int phone = rs.getInt("phone_number");
                String email = rs.getString("email");
                String address = rs.getString("address");
                int id1 = rs.getInt("customer_type_id");
                CustomerType customerType = new CustomerType(id1);
                customer = new Customer(id, name, birthday, gender, idCard, phone, email, address, customerType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return customer;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = BaseReponsitory.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String birthday = rs.getString("date_of_birthday");
                int gender = rs.getInt("gender");
                int idCard = rs.getInt("id_card");
                int phone = rs.getInt("phone_number");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String nameCustomerType = rs.getString("customer_type_name");
                int id1 = rs.getInt("customer_type_id");
                CustomerType customerType = new CustomerType(id1, nameCustomerType);
                Customer customer = new Customer(id, name, birthday, gender, idCard, phone, email, address, customerType);
                customerList.add(customer);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean deleteCustomer(int id) {
        Connection connection = BaseReponsitory.getConnection();
        Boolean rowDelete = false;
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_SQL);
            statement.setInt(1, id);
            rowDelete = statement.executeUpdate() > 0;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowDelete;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        boolean rowUpdate = false;
        Connection connection = BaseReponsitory.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_SQL);
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getBirthday());
            statement.setInt(3, customer.getGender());
            statement.setInt(4, customer.getIdCard());
            statement.setInt(5, customer.getPhone());
            statement.setString(6, customer.getEmail());
            statement.setString(7, customer.getAddress());
            statement.setInt(8, customer.getCustomerType().getId());
            statement.setInt(9, customer.getId());
            rowUpdate = statement.executeUpdate() > 0;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdate;
    }

    @Override
    public List<Customer> searchCustomer(String name, String address, int gender) {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = BaseReponsitory.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(SEARCH_CUSTOMER_SQL);
            ps.setString(1, "%" + name + "%");
            ps.setString(2, "%" + address + "%");
            ps.setInt(3, Integer.parseInt("%" + gender + "%"));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String nameSearch = rs.getString("name");
                String birthday = rs.getString("date_of_birthday");
                int genderSearch = rs.getInt("gender");
                int idCard = rs.getInt("id_card");
                int phone = rs.getInt("phone_number");
                String email = rs.getString("email");
                String addressSearch = rs.getString("address");
                String nameCustomerType = rs.getString("customer_type_name");
                int id1 = rs.getInt("customer_type_id");
                CustomerType customerType = new CustomerType(id1, nameCustomerType);
                Customer customer = new Customer(id, nameSearch, birthday, genderSearch, idCard, phone, email, addressSearch, customerType);
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }


}
