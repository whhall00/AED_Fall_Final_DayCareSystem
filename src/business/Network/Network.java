/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Network;
import business.Enterprise.*;
/**
 *
 * @author hao
 */
public class Network {
    private String networkName;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    public boolean checkIfEnterpriseisUnique(String Name) {

        for (Enterprise enterprise : this.enterpriseDirectory.getEnterpriseList()) {
            if (enterprise.getName().equals(Name)) {
                return false;
            }
        }
        return true;

    }
    
    @Override
    public String toString(){
        return networkName;
    }
}
