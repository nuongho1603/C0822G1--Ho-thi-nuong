package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.IUserDaoService;
import com.codegym.service.impl.UserDaoService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    IUserDaoService userDaoService = new UserDaoService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create":
                    showNewForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteUser(request, response);
                    break;
                default:
                    listUser(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertUser(request, response);
                    break;
                case "edit":
                    updateUser(request, response);
                    break;
                case "search":
                    searchUser(request, response);
                    break;
                case "delete":
                    deleteUser(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }



    private void searchUser(HttpServletRequest request, HttpServletResponse response) {
        String country = request.getParameter("country");
        request.setAttribute("country",country);
        List<User> userList = userDaoService.searchUser(country);
        request.setAttribute("listUser", userList);

        try {
            request.getRequestDispatcher("user/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    private void listUser(HttpServletRequest request, HttpServletResponse response)
    {
        List<User> listUser = userDaoService.selectAllUsers();
        request.setAttribute("listUser", listUser);
           try {
               request.getRequestDispatcher("user/list.jsp").forward(request, response);
           } catch (ServletException e) {
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = userDaoService.selectAllUsers();
        request.setAttribute("userList", userList);
        try {
            request.getRequestDispatcher("user/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User existingUser = userDaoService.selectUser(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/edit.jsp");
        request.setAttribute("user", existingUser);
        dispatcher.forward(request, response);
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        User newUser = new User(name, email, country);
      boolean check =  userDaoService.insertUser(newUser);
      String mess = "Add ok roi đó! ";
      if(!check){
          mess ="User ch được add!";
      }
      request.setAttribute("mess",mess);
      showNewForm(request,response);
//     request.getRequestDispatcher("user/create.jsp").forward(request, response);
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        User book = new User(id, name, email, country);
        try {
            userDaoService.updateUser(book);
       RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/edit.jsp");
       request.setAttribute("mess","Update ok roi đó! ");
       requestDispatcher.forward(request, response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        userDaoService.deleteUser(id);

        List<User> listUser = userDaoService.selectAllUsers();
        request.setAttribute("listUser", listUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
        dispatcher.forward(request, response);
    }
}
//    private void delete(HttpServletRequest request, HttpServletResponse response){
//        int deleteId = Integer.parseInt(request.getParameter("deleteId"));
//        boolean check = userDaoService.delete(deleteId);
//        String mess = "Bạn đã xóa thành công !";
//        if (!check) {
//            mess = "Xoas kh thành công !";
//        }
//        request.setAttribute("mess", mess);
//        listUser(request, response);
//    }