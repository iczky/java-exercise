package com.adepuu.exercises.session7;

import java.util.UUID;

public class Event {
    private String id;
    private String name;
    private int ticketQuota;
    private int ticketSold;

    public Event (String name, int maxTicketQuota) {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
        this.name = name;
        ticketQuota = maxTicketQuota;
    }
}
