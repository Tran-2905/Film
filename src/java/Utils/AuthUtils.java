/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import dao.UserDAO;
import dto.User;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class AuthUtils {
    public static final String ADMIN_ROLE = "admin";
    public static final String USER_ROLE = "user";
    public static User getUser(String strUserID) {
        UserDAO udao = new UserDAO();
        User user = udao.readbyID(strUserID);
        return user;
    }

    public static boolean isValidLogin(String strUserID, String strPassword) {
        User user = getUser(strUserID);
        if (user != null && PasswordUtils.checkPassword(strPassword, user.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isLoggedIn(HttpSession session){
        return session.getAttribute("user")!=null;
    }
    
    public static boolean isAdmin(HttpSession session){
        if(!isLoggedIn(session)){
            return false;
        }
        User user = (User)session.getAttribute("user");
        return user.getRole().equals(ADMIN_ROLE);
    }
}
