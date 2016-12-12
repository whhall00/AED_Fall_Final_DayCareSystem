/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person.Employee;

import business.Person.Person;
import business.Salary.Salary;

/**
 *
 * @author hao
 */
public class Nutritionist extends Person{
    private Salary salary;

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    
    
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName();
    }
}
