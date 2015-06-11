package classes.Servlets;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Иван on 11.06.2015.
 */

public class Redirect extends HttpServlet {
    public static int count=0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;
        req.setAttribute("current_count", count);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
