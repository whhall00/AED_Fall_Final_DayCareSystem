/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization.CustomerOrganization;

import business.Organization.Organization;
import business.Role.CustomerRole.ParentsRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hao
 */
public class ParentsOrganization extends Organization{

    public ParentsOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList<>();
        role.add(new ParentsRole());
        return role;
    }
    
}
