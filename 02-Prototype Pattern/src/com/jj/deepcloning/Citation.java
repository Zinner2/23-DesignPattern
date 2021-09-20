package com.jj.deepcloning;

import java.io.Serializable;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class Citation implements Cloneable, Serializable {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    @Override
    public String toString() {
        return "Citation{" +
                "user=" + user +
                '}';
    }
}
