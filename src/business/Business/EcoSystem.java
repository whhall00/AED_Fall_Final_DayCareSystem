/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Business;

import business.Customer.Child;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.Person.Person;
import business.Role.AdminRole;
import business.Role.Role;
import business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author hao
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance() {
        if (business == null) {

            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public void DeleteNetwork(Network n) {
        networkList.remove(n);
    }
    
    public boolean checkIfNetworkisUnique(String networkName) {

        for (Network n : this.networkList) {
            if (n.getNetworkName().equals(networkName)) {
                return false;
            }

        }
        return true;

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new AdminRole());
        return roleList;
    }

    //
    public boolean checkIfUsernameIsUnique(String username) {

        for (UserAccount ua : this.getUserAccountDirectory().getUserAccountList()) {
            // System.out.println("EcoSystem" + ua.getUsername());
            if (ua.getUsername().equals(username)) {
                return false;
            }
            for (Network n : this.getNetworkList()) {
                for (Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount ucc : ent.getUserAccountDirectory().getUserAccountList()) {
                        //           System.out.println("Enterprise-->" + ucc.getUsername());
                        if (ucc.getUsername().equals(username)) {
                            return false;
                        }
                        for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount accOrg : org.getUserAccountDirectory().getUserAccountList()) {
                                //                 System.out.println("Organization-->" + accOrg.getUsername());
                                if (accOrg.getUsername().equals(username)) {
                                    return false;
                                }
                            }

                        }
                    }

                }
            }

        }
        return true;
    }
    
    public int caculateTotalEnterprise(){
        int a = 0;
        
        for(Network network: this.networkList){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                a++;
            }
        }
        return a;
    }
    
    public int caculateTotalNetwork(){
        int a = 0;        
        for(Network network: this.networkList){
            a++;
        }
        return a;
    }
    public int caculateTotalPerson(){
        int a = 0;
        for(Network network: this.networkList){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Person person : enterprise.getPersonDirectory().getPersonList()){
                    a++;
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        for(Person p : organization.getPersonDirectory().getPersonList()){
                            a++;
                        }
                    }
                }
            }
        }
        return a;
    }
    
    public int caculateTotalChild(){
        int a = 0;
        for(Network network: this.networkList){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.DayCareInstitution)){
                    for(Person person : enterprise.getPersonDirectory().getPersonList()){
                        if(person instanceof Child){
                            a++;
                        }
//                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//                        for(Person p : organization.getPersonDirectory().getPersonList()){
//                            a++;
//                        }
//                    }
                }
                }
                
            }
        }
        return a;
    }
    public int caculateTotalDayCare(){
        int a = 0;
        for(Network network: this.networkList){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.DayCareInstitution)){
                    a++;                    
                }                
            }
        }
        return a;
    }
    public int caculateTotalRestaurant(){
        int a = 0;
        for(Network network: this.networkList){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Restaurant)){
                    a++;                    
                }                
            }
        }
        return a;
    }
    public int caculateTotalHospital(){
        int a = 0;
        for(Network network: this.networkList){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
                    a++;                    
                }                
            }
        }
        return a;
    }
    
}
