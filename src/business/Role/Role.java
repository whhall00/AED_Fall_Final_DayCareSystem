/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author hao
 */
public abstract class Role {
    public enum RoleType{
        Manager("Manager"), Teacher("Teacher"), Parents("Parents"), Nutritionist("Nutritionist");
        private String value;
        private RoleType(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);
}
