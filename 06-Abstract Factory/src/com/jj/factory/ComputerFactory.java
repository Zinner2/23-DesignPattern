package com.jj.factory;

import com.jj.entity.Computer;
import com.jj.entity.Phone;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public interface ComputerFactory {

    /**
     * 生产电脑
     * @return
     */
    Computer createComputer();

    /**
     * 生产手机
     * @return
     */
    Phone createPhone();
}
