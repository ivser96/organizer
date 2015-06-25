package classes.Servlets;
import classes.Main;
import classes.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ���� on 11.06.2015.
 */
@WebServlet("/login")
public class Redirect extends HttpServlet {
    public static int count=0;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Login begin");

        User curUser = Main.signInUser(req.getParameter("login"), req.getParameter("password"));
        if(curUser == null) {
            req.getRequestDispatcher("sgnin.jsp").forward(req, resp);
            System.out.println("Login failed");
        }
        else {
            req.setAttribute("userLogin", curUser.getLogin());
            req.setAttribute("userName", curUser.getName());
            req.setAttribute("userSurName", curUser.getSurname());
            req.setAttribute("userPassword", curUser.getPassword());
            req.getRequestDispatcher("planner.jsp").forward(req, resp);
            System.out.println("Login success");
        }

//        count++;
//        req.setAttribute("current_count", count);
//        req.getRequestDispatcher("sgnin.jsp").forward(req, resp);
    }
}
