/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Course;

/**
 *
 * @author hao
 */
public class Course {
    private String courseName;
    private String courseDescription;
    private String startTime;
    private String endTime;
    private int credit;
    private double pricePerCredit;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
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

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getPricePerCredit() {
        return pricePerCredit;
    }

    public void setPricePerCredit(double pricePerCredit) {
        this.pricePerCredit = pricePerCredit;
    }
    

}
