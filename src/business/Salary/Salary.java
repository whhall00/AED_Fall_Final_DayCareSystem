/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Salary;

import java.util.Random;

/**
 *
 * @author hao
 */
public class Salary implements Isalary{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
       
    @Override
    public double caculateMonthlySalary() {
        Random random = new Random();
        double a = random.nextDouble()*3000 + 1000;
        this.salary = a;
        return salary;
    }
    
}
