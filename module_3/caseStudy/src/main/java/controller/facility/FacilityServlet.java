package controller.facility;

import modal.Facility.Facility;
import service.IFacilityService;
import service.impl.FacilityService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@WebServlet(name = "FacilityServlet", value = "/facility")
public class FacilityServlet extends HttpServlet {
    IFacilityService iFacilityService = new FacilityService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "add":
                addFacility(request,response);
                break;
            case "delete":
                showDeleteFacility(request,response);
                break;

        }
    }

    private void addFacility(HttpServletRequest request, HttpServletResponse response) {

    }

    private void showDeleteFacility(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("deleteId"));
        boolean check = iFacilityService.deleteFacility(id);
        List<Facility> facilityList = iFacilityService.selectAllFacility();
        request.setAttribute("facilityList",facilityList);
        String mess = "DELETE thành công rùi đó !";
        if (!check){
            mess = "DELETE khong thành công !";
        }
        request.setAttribute("mess",mess);
        showListFacility(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "add":
                showAddFacility(request,response);
                break;
            default:
                showListFacility(request,response);
                break;
        }
    }

    private void showAddFacility(HttpServletRequest request, HttpServletResponse response) {
        List<Facility> facilityList = iFacilityService.selectAllFacility();
        request.setAttribute("facilityList",facilityList);
        try {
            request.getRequestDispatcher("/facility/addFacility.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListFacility(HttpServletRequest request, HttpServletResponse response) {
        List<Facility> facilityList = iFacilityService.selectAllFacility();
        request.setAttribute("facilityList",facilityList);
        try {
            request.getRequestDispatcher("/facility/displayFacility.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
