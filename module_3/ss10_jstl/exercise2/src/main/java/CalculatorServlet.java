import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int first = Integer.parseInt(request.getParameter("first"));
        int second = Integer.parseInt(request.getParameter("second"));
        double result = 0;
        String operator = request.getParameter("operator");
        switch (operator) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                try {
                    result = first / second;

                } catch (ArithmeticException e) {
                    request.setAttribute("result", "Error : 0");
                    request.getRequestDispatcher("result.jsp").forward(request, response);
                    return;
                }
                break;
        }
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("operator", operator);
        request.setAttribute("result", result);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
