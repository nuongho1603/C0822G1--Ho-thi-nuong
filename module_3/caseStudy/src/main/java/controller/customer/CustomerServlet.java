package controller.customer;

import modal.customer.Customer;
import modal.customer.CustomerType;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    ICustomerService iCustomerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                insertCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
            case "search":
                search(request,response);
                break;
        }

    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int customerId = Integer.parseInt(request.getParameter("deleteId"));
        boolean check = iCustomerService.deleteCustomer(customerId);
        String mess = "Bạn đã delete ok rồi đó! ";
        if (!check) {
            mess = "delete kh thành công ! ";
        }

        request.setAttribute("mess", mess);

        showListCustomer(request, response);

    }




    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int gender = Integer.parseInt(request.getParameter("gender"));
        int idCard = Integer.parseInt(request.getParameter("idCard"));
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        CustomerType customerType = new CustomerType(customerTypeId);
        Customer newCus = new Customer(name, birthday, gender, idCard, phone, email, address, customerType);
        boolean check = iCustomerService.insertCustomer(newCus);
        String mess = "Bạn đã add ok rồi đó! ";
        if (!check) {
            mess = "ADD kh thành công ! ";
        }
        request.setAttribute("mess", mess);
        showListCustomer(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                showAddCustomer(request, response);
                break;
            case "edit":
                showEditCustomer(request, response);
                break; 
                case "delete":
                    showDeleteCustomer(request, response);
                break;
            case "search":
                showSearch(request,response);
                break;
            default:
                showListCustomer(request, response);
                break;
        }
    }

    private void showSearch(HttpServletRequest request, HttpServletResponse response) {
   int id = Integer.parseInt(request.getParameter("id"));
   iCustomerService.selectCustomer(id);
   List<Customer> customerList= iCustomerService.selectAllCustomer();
   request.setAttribute("customerList",customerList);
        try {
            request.getRequestDispatcher("/customer/displayCustomer.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("searchName");
        String address = request.getParameter("searchAddress");
        int gender = Integer.parseInt(request.getParameter("searchGender"));

        List<Customer> customerList = iCustomerService.searchCustomer(name,address,gender);
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("/customer/displayCustomer.jsp").forward(request,response);

    }
    private void showDeleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        iCustomerService.deleteCustomer(id);
        List<Customer> customerList =iCustomerService.selectAllCustomer();
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("/customer/displayCustomer.jsp").forward(request,response);

    }
    private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = iCustomerService.selectCustomer(id);
        request.setAttribute("customer", customer);
        try {
            request.getRequestDispatcher("/customer/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int gender = Integer.parseInt(request.getParameter("gender"));
        int idCard = Integer.parseInt(request.getParameter("idCard"));
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        CustomerType customerType = new CustomerType(customerTypeId);
        Customer newCus = new Customer(id,name, birthday, gender, idCard, phone, email, address, customerType);
        boolean check = iCustomerService.updateCustomer(newCus);
        String mess = "Update thành công rùi đó! ";
        if (!check) {
            mess = "Update CHƯA thành công đâu!";
        }
        request.setAttribute("mess", mess);
        showListCustomer(request, response);
    }

    private void showListCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = iCustomerService.selectAllCustomer();
        request.setAttribute("customerList", customerList);
        try {
            request.getRequestDispatcher("customer/displayCustomer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAddCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = iCustomerService.selectAllCustomer();
        request.setAttribute("customerList", customerList);
        try {
            request.getRequestDispatcher("customer/addCustomer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
