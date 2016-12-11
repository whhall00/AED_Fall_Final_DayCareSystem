/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Menu.Menu;
import business.Menu.MenuDirectory;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hao
 */
public class RestaurantEnterprise extends Enterprise{
    private MenuDirectory menuDirectory;
    private String contactInformation;
    private String Address;
    
    public RestaurantEnterprise(String name) {
        super(name, EnterpriseType.Restaurant);
        menuDirectory = new MenuDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(MenuDirectory menuDirectory) {
        this.menuDirectory = menuDirectory;
    }
    
    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
    @Override
    public String toString(){
        return getName();
    }
}
