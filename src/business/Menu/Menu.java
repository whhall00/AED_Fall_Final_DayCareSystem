/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Menu;

/**
 *
 * @author Chau_
 */
public class Menu {

    private String name;
    private String stapleFood;
    private String fruit;
    private String beverage;
    private int totalCalorie;
    private boolean aginomoto;//味精

    public Menu(int totalCalorie, boolean aginmoto) {
        this.aginomoto = aginmoto;
        this.totalCalorie = totalCalorie;
    }
        public Menu() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStapleFood() {
        return stapleFood;
    }

    public void setStapleFood(String stapleFood) {
        this.stapleFood = stapleFood;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public int getTotalCalorie() {
        return totalCalorie;
    }

    public void setTotalCalorie(int totalCalorie) {
        this.totalCalorie = totalCalorie;
    }

    public boolean isAginomoto() {
        return aginomoto;
    }

    public void setAginomoto(boolean aginomoto) {
        this.aginomoto = aginomoto;
    }
    public String toString(){
        return name;
    }
}
