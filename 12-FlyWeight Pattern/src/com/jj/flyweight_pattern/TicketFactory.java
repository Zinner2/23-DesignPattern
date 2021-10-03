package com.jj.flyweight_pattern;

import sun.security.krb5.internal.Ticket;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 张俊杰
 * @date 2021/10/3  - {TIME}
 */
public class TicketFactory {
    private static Map<String,Tickets> ticketsMap;

    private TicketFactory() {
        ticketsMap = new HashMap<>();
    }
    private static TicketFactory ticketFactory = new TicketFactory();

    public static TicketFactory getTicketFactory(){ return ticketFactory;}

    public  Tickets getTickets(String from,String to){
        String key = from + "-->" + to;
        if (!ticketsMap.containsKey(key)){
            Tickets tickets = new TranTickets(from,to);
            ticketsMap.put(key,tickets);
        }
        return ticketsMap.get(key);
    }

}
