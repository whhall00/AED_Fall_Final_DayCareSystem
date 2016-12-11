/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.CourseOffering;

import java.util.ArrayList;

/**
 *
 * @author Chau_
 */
public class CourseOfferingSchedule {
    
    private ArrayList<CourseOffering> courseOfferingList;
    
    public CourseOfferingSchedule(){
        courseOfferingList = new ArrayList<CourseOffering>();
    }
    
    public CourseOffering addCourseOffering(){
        CourseOffering courseOffering = new CourseOffering();
        courseOfferingList.add(courseOffering);
        return courseOffering   ;
    }
    
}
