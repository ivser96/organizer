package classes.Servlets;

import classes.Main;
import classes.User;
import com.mysql.fabric.jdbc.FabricMySQLDriver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Created by ���� on 11.06.2015.
 */
@WebServlet("/login")
public class Redirect extends HttpServlet {
    public static int count=0;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Login begin");
        Driver driver = null;
        try {
            driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/organizer", "root", "030296");
            if (!conn.isClosed()){
                System.out.println("Conection is good");}

            conn.close();
        } catch (SQLException e) {
            System.out.println("Ошибка соединения");
            e.printStackTrace();
        }




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
