package com.jj.flyweight_pattern;

/**
 * 火车票
 * @author 张俊杰
 * @date 2021/10/3  - {TIME}
 */
public class TranTickets implements Tickets {
    private String from;
    private String to;

    public TranTickets(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicket(Level level) {
        System.out.println(from+"--->"+to);
        System.out.println("等级 = "+level.class1);
        System.out.println("价格 = "+level.price);
    }

    @Override
    public NewTicket getNewTicket(Tickets tickets, Level level) {
        return new NewTicket(tickets,level);
    }

    @Override
    public String toString() {
        return "TranTickets{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
