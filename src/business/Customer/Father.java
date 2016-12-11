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
    private boolean workStatus;
    private Child child;


    public boolean isWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(boolean workStatus) {
        this.workStatus = workStatus;
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
