package controller;

import modal.TComplex;
import service.ITComplexService;
import service.impl.TComplexService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TComplexServlet", value = "/tcomplex")
public class TComplexServlet extends HttpServlet {
    ITComplexService itComplexService = new TComplexService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "add":
                break;
            case "delete":
                delete(request, response);
                break;

        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        String tComplexMa = request.getParameter("xoaMa");
        boolean check = itComplexService.delete(tComplexMa);
        String mess = "Bạn đã delete ok rồi đó! ";
        if (!check) {
            mess = "delete kh thành công ! ";
        }

        request.setAttribute("mess", mess);

        displayTComplex(request, response);

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
                break;
            case "delete":
                showDelete(request, response);
                break;
            default:
                displayTComplex(request, response);
                break;
        }
    }

    private void showDelete(HttpServletRequest request, HttpServletResponse response) {
        String maMB = request.getParameter("maMB");
        itComplexService.delete(maMB);
        List<TComplex> tComplexes = itComplexService.selectAllTComplex();
        request.setAttribute("tComplexes", tComplexes);
        try {
            request.getRequestDispatcher("/tcomplex/display.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayTComplex(HttpServletRequest request, HttpServletResponse response) {
        List<TComplex> tComplexList = itComplexService.selectAllTComplex();
        request.setAttribute("tComplexList", tComplexList);
        try {
            request.getRequestDispatcher("/tcomplex/display.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
