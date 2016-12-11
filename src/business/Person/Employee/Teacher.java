/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person.Employee;

import business.CourseOffering.CourseOffering;
import business.Person.Person;
import business.Salary.Salary;
import java.util.ArrayList;

/**
 *
 * @author hao
 */
public class Teacher extends Person{
    private Salary salary;
    private ArrayList<CourseOffering> myCourseOffering;
    
    public Teacher(){
        myCourseOffering = new ArrayList<>();
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public ArrayList<CourseOffering> getMyCourseOffering() {
        return myCourseOffering;
    }

    public void setMyCourseOffering(ArrayList<CourseOffering> myCourseOffering) {
        this.myCourseOffering = myCourseOffering;
    }
    
    public void addCourseOffering(CourseOffering co)
    {
        myCourseOffering.add(co);
        return;
    }
    
    public void deleteCourseOffering(CourseOffering co)
    {
        myCourseOffering.remove(co);
        return;
    }
    
    
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName();
    }
}
