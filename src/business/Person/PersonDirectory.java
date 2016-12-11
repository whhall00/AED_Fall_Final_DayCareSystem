/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import java.util.ArrayList;

/**
 *
 * @author hao
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
    public PersonDirectory(){
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person createPerson(){
        Person p = new Person();
        personList.add(p);
        return p;
    }
    public void addPerson(Person p){
        personList.add(p);
    }
    public void deletePrson(Person p){
        personList.remove(p);
    }
  
}
