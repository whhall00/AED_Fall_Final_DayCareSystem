/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.CourseOffering;

import business.Course.Course;
import business.Customer.Child;
import business.Person.Employee.Teacher;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Chau_
 */
public class CourseOffering extends Course{
    private Date date;
    private Teacher teacher;
    private String classRoom;
    private String startTime;
    private String endTime;
    private int childNum;
    private ArrayList<Child> childInClass;
    
    public void addChild(Child child)
    {
        childInClass.add(child);
        return;
    }
    
    public void deleteChild(Child child)
    {
        childInClass.remove(child);
        return;
    }

    public ArrayList<Child> getChildInClass() {
        return childInClass;
    }

    public void setChildInClass(ArrayList<Child> childInClass) {
        this.childInClass = childInClass;
    }

    public int getChildNum() {
        return childNum;
    }

    public void setChildNum(int childNum) {
        this.childNum = childNum;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
}
