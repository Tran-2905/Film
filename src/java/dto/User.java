/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Admin
 */
public class User {
    private String role;
    private String userName;
    private String fullName;
    private String email;
    private String password;

    public String getRole() {
        return role;
    }

    public void setRole(String id) {
        if (id.equalsIgnoreCase("admin") || id.equalsIgnoreCase("user")) {
            this.role = id;
        } else {
            throw new IllegalArgumentException("Invalid role value");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
        this.role = "User";
    }

    public User(String userName, String fullName, String Email, String password) {
        this.role = "user";
        this.userName = userName;
        this.fullName = fullName;
        this.email = Email;
        this.password = password;
    }

    public User(String role, String userName, String fullName, String email, String password) {
        this.role = role;
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }
    
}
