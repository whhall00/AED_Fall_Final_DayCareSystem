/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Course.CourseDirectory;
import business.CourseOffering.CourseOfferingSchedule;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hao
 */
public class DayCareEnterprise extends Enterprise{
   
    private CourseDirectory CourseList;
    private CourseOfferingSchedule  courseOfferingSchedule;
    
    public DayCareEnterprise(String name) {
        super(name, EnterpriseType.DayCareInstitution);
        
        CourseList = new CourseDirectory();
        courseOfferingSchedule = new CourseOfferingSchedule();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public CourseDirectory getCourseList() {
        return CourseList;
    }

    public void setCourseList(CourseDirectory CourseList) {
        this.CourseList = CourseList;
    }

    public CourseOfferingSchedule getCourseOfferingSchedule() {
        return courseOfferingSchedule;
    }

    public void setCourseOfferingSchedule(CourseOfferingSchedule courseOfferingSchedule) {
        this.courseOfferingSchedule = courseOfferingSchedule;
    }
    
}
