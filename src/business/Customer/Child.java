/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

import business.Balance.Balance;
import business.Health.Health;
import business.Health.VitalSign;
import business.Person.Person;

/**
 *
 * @author hao
 */
public class Child extends Person{
    private Parents parents;    
    private Health health;
    private VitalSign vitalSign;
    private Balance balance;
    
    
    
    public double calculateBMI(){
        //体质指数（BMI）=体重（kg）÷身高^2（m）
        double BMI;
        if(this.getHealth()!=null){
            BMI = this.getHealth().getWeight()/((this.getHealth().getHeight()/100)*(this.getHealth().getHeight()/100));
        return BMI;
        }else return 0.0;
        
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName();
    }
    
}
