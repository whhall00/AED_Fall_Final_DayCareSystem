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
    
    public CourseOffering createANdAddCourseOffering(){
        CourseOffering co = new CourseOffering();
        courseOfferingList.add(co);
        return co;
    }

    public ArrayList<CourseOffering> getCourseOfferingList() {
        return courseOfferingList;
    }

    public void setCourseOfferingList(ArrayList<CourseOffering> courseOfferingList) {
        this.courseOfferingList = courseOfferingList;
    }
    
}
