/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Menu.Menu;

/**
 *
 * @author Chau_
 */
public class RestaurantWorkRequest extends WorkRequest {

    private String testResult;
    private Menu menu;
    private int amount;

    public int getAmout() {
        return amount;
    }

    public void setAmout(int amout) {
        this.amount = amout;
    }
    
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    @Override
    public String toString(){
        return this.getSender().getUsername();
    }
    
}
