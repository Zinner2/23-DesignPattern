package com.jj.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张俊杰
 * @date 2021/9/22  - {TIME}
 */
public class Menu extends MenuComponent {

    public List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
       menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent component :menuComponentList){
             component.print();
        }
    }
}
