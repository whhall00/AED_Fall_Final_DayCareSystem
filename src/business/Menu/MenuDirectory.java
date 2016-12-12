/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Menu;

import java.util.ArrayList;

/**
 *
 * @author hao
 */
public class MenuDirectory {
    private ArrayList<Menu> menus;
    public MenuDirectory(){
        menus = new ArrayList<Menu>();
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    
//    public void createAndAddMenu(Menu m){
//        menuList.add(m);
//    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }
    public void deleteMenu(Menu menu){
        menus.remove(menu);
    }
    
}
