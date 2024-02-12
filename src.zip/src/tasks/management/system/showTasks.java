/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasks.management.system;

import java.util.Date;

/**
 *
 * @author terevenareda
 */
public class showTasks {
   private int Code,Employee_id;
   private String Title,Description,Project,Employee;
   private int Phase;
   private Date Start_date,End_date;

    public int getCode() {
        return Code;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getPhase() {
        return Phase;
    }

    public String getProject() {
        return Project;
    }

    public int getEmployee() {
        return Employee_id;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setPhase(int Phase) {
        this.Phase = Phase;
    }

    public void setProject(String Project) {
        this.Project = Project;
    }

    public void setEmployee(int Employee_id) {
        this.Employee_id = Employee_id;
    }

    public Date getStart_date() {
        return Start_date;
    }

    public void setStart_date(Date Start_date) {
        this.Start_date = Start_date;
    }

    public Date getEnd_date() {
        return End_date;
    }

    public void setEnd_date(Date End_date) {
        this.End_date = End_date;
    }
   
    
}
