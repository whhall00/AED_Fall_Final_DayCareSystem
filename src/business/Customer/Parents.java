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
public class Parents extends Person{
    private Father father;
    private Mother mother;
    
    public Parents()
    {
        this.father = new Father();
        this.mother = new Mother();
        if(father.isStatus() == true || mother.isStatus() == true)
        {
            father.getChild().setStatus(true);
            mother.getChild().setStatus(true);
        }
        else
        {
            father.getChild().setStatus(false);
            mother.getChild().setStatus(false);
        }
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }
    
}
