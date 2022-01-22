package controller;

import dao.UserDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import service.UserService;

@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet{

    User user;
    UserService userService;
    
    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        userService = new UserService();
    }

    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("hello servlet");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        System.out.println(username);
//        System.out.println(password);
        boolean status = userService.doLogin(req);
        if(status ==  true){
            List<User> users = userService.getAll();
            System.out.println(users.get(0).getUsername());
            req.setAttribute("users", users);
            req.getRequestDispatcher("welcome.jsp").forward(req, resp);
        }else{
            System.out.println("else part");
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
    
    
    
}

