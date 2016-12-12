/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

import business.Person.Person;


/**
 *
 * @author hao
 */
public class Father extends Person{
    private boolean status;
    private Child child;


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName();
    }
    
}
