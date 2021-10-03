package com.jj.flyweight_pattern;

/**
 * @author 张俊杰
 * @date 2021/10/3  - {TIME}
 */
public interface Tickets {

    /**
     * 展示车票
     * @param level
     */
    void showTicket(Level level);

    NewTicket getNewTicket(Tickets tickets,Level level);
}
