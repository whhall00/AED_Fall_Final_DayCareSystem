/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;
import business.Organization.DayCareOrganization.ManagerOrganization;
import business.Organization.DayCareOrganization.NutritionistOrganization;
import business.Organization.DayCareOrganization.TeacherOrganization;
import java.util.ArrayList;
/**
 *
 * @author hao
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    public OrganizationDirectory(){
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    
    public Organization createAndAddDayCareOrganization(String name, Organization.DayCareOrganizationType type) {
        Organization organization = null;
        if(type.getValue().equals(Organization.DayCareOrganizationType.Admin)){
            organization = new ManagerOrganization(name);
            organizationList.add(organization);
        } else if(type == Organization.DayCareOrganizationType.Teacher){
            organization = new TeacherOrganization(name);
            organizationList.add(organization);
        } else if(type == Organization.DayCareOrganizationType.Nutritionist){
            organization = new NutritionistOrganization(name);
            organizationList.add(organization);
        }   
        return organization;
    }
    
//    public Organization fetchOrganization(Organization.DayCareOrganizationType type){
//        for(Organization organization : organizationList){
//            if(organization.getDayCareOrganizationType().getValue().equals(type.getValue())){
//                return organization;
//            }
//        }
//        return null;
//    }
}
