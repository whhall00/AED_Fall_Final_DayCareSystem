/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization.RestaurantOrganization;

import business.Organization.Organization;
import business.Role.Restaurant.RestaurantManagerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hao
 */
public class RestaurantManagerOrganization extends Organization{

    public RestaurantManagerOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RestaurantManagerRole());
        return roles;
    }
    
}
