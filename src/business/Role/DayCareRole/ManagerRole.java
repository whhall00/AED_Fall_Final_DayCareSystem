/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role.DayCareRole;

import business.Business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Role.Role;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ManagerRole.ManagerWorkArea;

/**
 *
 * @author hao
 */
public class ManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ManagerWorkArea(userProcessContainer, enterprise, account, business);
    }
    @Override
    public String toString(){
        return "Manager";
    }
}
