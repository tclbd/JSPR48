/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDAO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.User;

/**
 *
 * @author Faculty Pc
 */
public class UserService {

    public boolean doRegister(HttpServletRequest req) {
        User user = new User();
        if(req.getParameter("username").length() < 2){
            return false;
        }
        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        return new UserDAO().doRegister(user);
    }

    public boolean doLogin(HttpServletRequest req) {
        User user = new User();
        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        return new UserDAO().doLogin(user);
    }

    public List<User> getAll() {
        return new UserDAO().getAll();
    }
}
