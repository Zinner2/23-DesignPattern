package com.jj.composite;

/**
 * @author 张俊杰
 * @date 2021/9/22  - {TIME}
 */
public class Client {
    public static void main(String[] args) {

        MenuComponent menu1 = new Menu("用户管理",2);
                    MenuItem menuItem = new MenuItem("添加用户",3);
                    menu1.add(menuItem);
                    menu1.add(new MenuItem("删除用户",3));
                    menu1.add(new MenuItem("修改用户",3));
                    menu1.add(new MenuItem("查询用户",3));
        MenuComponent menu2 = new Menu("权限管理",2);
                    menu2.add(new MenuItem("访问权限",3));
                    menu2.add(new MenuItem("提交",3));
                    menu2.add(new MenuItem("保存",3));

        MenuComponent component = new Menu("系统管理",1);
                    component.add(menu1);
                    component.add(menu2);

        component.print();
       /* menu1.remove(menuItem);
        component.print();*/
    }
}
