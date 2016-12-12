/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role.CustomerRole;

import business.Business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Role.Role;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ParentsRole.ParentsWorkAreaJPanel;

/**
 *
 * @author hao
 */
public class ParentsRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ParentsWorkAreaJPanel(userProcessContainer, account, enterprise);
    }
    @Override
    public String toString(){
        return "Parent";
    }
}
