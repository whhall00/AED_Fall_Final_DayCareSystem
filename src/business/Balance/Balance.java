/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Balance;

import java.util.Date;

/**
 *
 * @author hao
 */
public class Balance {
    private double balance;
    private Date date;
    
    public Balance(){
        date = new Date();
    }
    
    public void addBalance(double value)
    {
        this.balance+=value;
    }
    
    public void cutBalance(double value)
    {
        this.balance-=value;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
