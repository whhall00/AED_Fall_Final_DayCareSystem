/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization.DayCareOrganization;

import business.Organization.Organization;
import business.Role.DayCareRole.ManagerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hao
 */
public class ManagerOrganization extends Organization{

    public ManagerOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManagerRole());
        return roles;
    }
    
}
