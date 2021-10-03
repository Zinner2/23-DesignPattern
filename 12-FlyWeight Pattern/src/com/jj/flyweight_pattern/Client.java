package com.jj.flyweight_pattern;

/**
 * @author 张俊杰
 * @date 2021/10/3  - {TIME}
 */
public class Client {
    public static void main(String[] args) {

        Tickets tickets = TicketFactory.getTicketFactory().getTickets("莆田","厦门");
        Level level = new YingZuo(100);
        tickets.showTicket(level);
        // 产生一个新的火车票
        NewTicket newTicket = tickets.getNewTicket(tickets,level);
        System.out.println(newTicket);
    }
}
