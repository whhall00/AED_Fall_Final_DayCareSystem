/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author hao
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.DayCareInstitution){
            enterprise = new DayCareEnterprise(name);
            enterpriseList.add(enterprise);
        } else if(type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if(type == Enterprise.EnterpriseType.Restaurant){
            enterprise = new RestaurantEnterprise(name);
            enterpriseList.add(enterprise);
        }   
        return enterprise;
    }
    
    public void deleteEnterprise(Enterprise enterprise){
        enterpriseList.remove(enterprise);
    }
}
