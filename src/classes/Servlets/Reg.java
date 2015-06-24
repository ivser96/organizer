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
 * Created by Иван on 24.06.2015.
 */
@WebServlet("/Reg")
public class Reg extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Main.signUpUser(req.getParameter("name"),req.getParameter("surname"),req.getParameter("login"),req.getParameter("password"));
        User curUser = Main.signInUser(req.getParameter("login"), req.getParameter("password"));
            req.setAttribute("userName", curUser.getLogin());
            req.getRequestDispatcher("planner.jsp").forward(req, resp);
            System.out.println("Login success");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
