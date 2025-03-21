/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Utils.DBUtils;
import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class UserDAO implements IDAO<User, String>{
    
    public boolean differenceUserName(String userName){
        boolean result = true;
        try {
            String sql = "SELECT username FROM [User] WHERE username = ?";
            Connection c = DBUtils.getConnection();
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, userName);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                result = false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return result;
    }
    @Override
    public boolean create(User entity) {
        String sql = "INSERT INTO [User] (role, username, fullname, email, password) VALUES (?,?,?,?,?)";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, entity.getRole());
            pst.setString(2, entity.getUserName());
            pst.setString(3, entity.getFullName());
            pst.setString(4, entity.getEmail());
            pst.setString(5, entity.getPassword());
            int n = pst.executeUpdate();
            return n>0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    @Override
    public List<User> readAll() {
        List<User> listUser = new ArrayList<User>();
        String sql = "SELECT * FROM [User]";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                User user = new User(
                        rs.getString("role"),
                        rs.getString("username"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                listUser.add(user);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listUser;
    }
    
    @Override
    public User readbyID(String id) {
        User user = null;
        String sql = "SELECT * FROM [User] WHERE username = (?)";
        
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                user = new User(
                        rs.getString("role"),
                        rs.getString("username"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getString("password")
                );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    @Override
    public boolean update(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> search(String searchTerm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isValidLogin(String txtUser, String txtPassword){
        boolean login = false;
        try {
            String sql = "SELECT * FROM [User] WHERE username = ? AND password = ?";
            Connection con = DBUtils.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, txtUser);
            pst.setString(2, txtPassword);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                login = true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return login;
    }
}
