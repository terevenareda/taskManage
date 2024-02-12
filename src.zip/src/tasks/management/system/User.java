/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasks.management.system;

/**
 *
 * @author bassamemad000
 */
public class User {
    private int ID;
    private String username;
    private String password;
    private String role;
    
    User(){
        
    }
    
    User(int id, String username, String password, String role){
        this.ID = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
