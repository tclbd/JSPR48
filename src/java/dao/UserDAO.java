/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.User;
import util.Database;

/**
 *
 * @author Faculty Pc
 */
public class UserDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean doRegister(User user) {
        String sql = "insert into login (username, password) values (?,?)";
        con = Database.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            int status = ps.executeUpdate();
            if (status > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean doLogin(User user) {
        System.err.println(user.getUsername());
        String sql = "select * from login where username = ?";
        con = Database.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            rs = ps.executeQuery();
            if (rs.next()) {
                String password = rs.getString("password");
                System.err.println("..  " + password);
                if (user.getPassword().equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
        }
        return false;
    }

    public List<User> getAll() {
        List<User> users = new ArrayList<User>();
        String sql = "select * from login";
        con = Database.getConnection();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                User u = new User();
                u.setUsername(username);
                u.setPassword(password);
                users.add(u);
            }
        } catch (Exception e) {
        }
        return users;
    }

}
