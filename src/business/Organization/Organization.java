/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;


import business.Person.PersonDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author hao
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    private DayCareOrganizationType dayCareOrganizationType;

    public DayCareOrganizationType getDayCareOrganizationType() {
        return dayCareOrganizationType;
    }
    

    public enum DayCareOrganizationType {

        Admin("Admin Organization"), Teacher("Teacher Organization"), Nutritionist("Nutritionist Organization");
        private String value;

        private DayCareOrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum CustomerType {

        Parents("Parents"), Child("Child");
        private String value;

        private CustomerType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum RestaurantOrganizationType {

        Admin("Admin"), FoodSupplier("Food Supplier"), LocalMaintainence("Local Maintainence Organization");
        private String value;

        private RestaurantOrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    public enum HospitalOrganizationType {

        Admin("Admin"), Doctor("Doctor"), LocalMaintainence("Local Maintainence Organization");
        private String value;

        private HospitalOrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

  

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
