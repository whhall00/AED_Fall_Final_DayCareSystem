/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Business;

import business.Person.Person;
import business.Role.AdminRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author hao
 */
public class ConfigureASystem {

    public static EcoSystem configure() {
        EcoSystem system = EcoSystem.getInstance();
        Person person = system.getPersonDirectory().createPerson();
        person.setFirstName("Hao");
        person.setLastName("Wang");
        //Not finish
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("gov", "gov", person, new AdminRole());        
        return system;
    }
    
}
