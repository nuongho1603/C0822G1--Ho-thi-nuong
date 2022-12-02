package controller;

import model.Product;
import org.apache.taglibs.standard.lang.jstl.GreaterThanOrEqualsOperator;
import service.IProductService;
import service.impl.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    IProductService productService = new ProductService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "add":
                save(request, response);
                break;
            case "delete":
                delete(request,response);
                break;
            case "search":
                break;
            case "edit":
                edit(request, response);
                break;
            default:
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));

        productService.delete(id);
        showListProduct(request, response);
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String content = request.getParameter("content");
        double price = Double.parseDouble(request.getParameter("price"));
        Product product = new Product(id, name, content, price);
        productService.update(id, product);
        showListProduct(request, response);


    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String content = request.getParameter("content");
        double price = Double.parseDouble(request.getParameter("price"));
        Product product = new Product(id, name, content, price);
        productService.add(product);
        showListProduct(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "add":
                showFormAdd(request, response);
                break;
            case "delete":
                showFormDelete(request,response);
                break;
            case "search":
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            default:
                showListProduct(request, response);
        }
    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/product/delete.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id", id);
        try {
            request.getRequestDispatcher("view/product/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormAdd(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/product/add.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = productService.findAll();
        request.setAttribute("productList", productList);
        try {
            request.getRequestDispatcher("view\\product\\list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
