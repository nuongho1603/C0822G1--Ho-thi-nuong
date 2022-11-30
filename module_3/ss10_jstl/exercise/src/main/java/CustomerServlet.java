import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer("Nương", "16/03/2004", "Quảng Nam", "https://scontent.fdad1-1.fna.fbcdn.net/v/t39.30808-6/275923965_1104797123423991_3575148104086959897_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=9MFeus6OJuAAX-v4Y4a&_nc_ht=scontent.fdad1-1.fna&oh=00_AfA1oN-6tNOUfN0GzmDeIu9d6a0FNx8KGfoNWcdGpp1Flg&oe=638BE4D5 "));
        customerList.add(new Customer("Diễm", "00/00/2004", "Quảng Nam", "https://scontent.fsgn2-2.fna.fbcdn.net/v/t39.30808-6/317424859_2333726990124963_1906024331267008338_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=98ZfY5bspTQAX_upBUW&_nc_ht=scontent.fsgn2-2.fna&oh=00_AfCFBojvmFCo8Tv4-ZMUjgx6LWE15cqExs3UCoeLvaJ_jw&oe=638CABCA"));
        customerList.add(new Customer("Lan", "00/00/2004", "Quảng BÌnh", "https://scontent.fsgn2-4.fna.fbcdn.net/v/t39.30808-6/314937387_636551968254738_170270774842024006_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=174925&_nc_ohc=r2PjIKo3KVIAX9UdXYF&_nc_ht=scontent.fsgn2-4.fna&oh=00_AfDxurOglpzyvEOGHoafSvqNK6h4Wur_FS6ViIBsXjysKw&oe=638BA9AD"));
        customerList.add(new Customer("Nga", "19/06/2004", "Hà Tĩnh", "https://scontent.fsgn2-7.fna.fbcdn.net/v/t39.30808-6/287168087_1315023055696048_6906378857643266884_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=d0OYnuFVrx4AX_CfVgC&_nc_ht=scontent.fsgn2-7.fna&oh=00_AfCl27PpnwjXWBtIzGMsbOuC_v4kS1Xz3oUCj2RNYhTZIA&oe=638B974B"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
