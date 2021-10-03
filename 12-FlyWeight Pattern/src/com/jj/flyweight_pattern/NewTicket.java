package com.jj.flyweight_pattern;

/**
 * @author 张俊杰
 * @date 2021/10/3  - {TIME}
 */
public class NewTicket {

    private Tickets tickets;
    private Level level;

    public NewTicket(Tickets tickets, Level level) {
        this.tickets = tickets;
        this.level = level;
    }

    @Override
    public String toString() {
        return "NewTicket{" +
                "tickets=" + tickets +
                ", level=" + level +
                '}';
    }
}
