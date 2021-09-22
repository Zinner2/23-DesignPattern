package com.jj.composite;

/**
 * @author 张俊杰
 * @date 2021/9/22  - {TIME}
 */
public abstract class MenuComponent {


    /**
     * 菜单组件的名称
     */
    protected String name;

    /**
     * 菜单组件的层级
     */
    protected int level;

    /**
     * 添加子菜单
     *
     * @param menuComponent
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 移除子菜单
     *
     * @param menuComponent
     */
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取指定的子菜单
     * @param index
     * @return
     */
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取菜单名字
     * @return
     */
    public String getName(){ return name;}

    /**
     * 打印菜单名称的方法(包括子菜单和子菜单项)
     */
    public abstract void print();
}
