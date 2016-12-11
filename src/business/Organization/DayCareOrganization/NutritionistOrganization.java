/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization.DayCareOrganization;

import business.Organization.Organization;
import business.Role.DayCareRole.NutritionistRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hao
 */
public class NutritionistOrganization extends Organization{

    public NutritionistOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NutritionistRole());
        return roles;    
    }
    
}
