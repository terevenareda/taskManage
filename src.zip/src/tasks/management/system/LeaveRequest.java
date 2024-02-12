/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasks.management.system;

import java.util.Date;

/**
 *
 * @author Ayaas
 */
public class LeaveRequest {
    private int id;
    private String type;
    private Date Date;
    private boolean isApproved;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Date getDate() {
        return Date;
    }

    public boolean getIsApproved() {
        return isApproved;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }
    
    
    
    
}
