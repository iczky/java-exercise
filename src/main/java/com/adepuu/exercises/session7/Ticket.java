package com.adepuu.exercises.session7;

import java.util.UUID;

public class Ticket {
    private String id;

    private String event_id;

    public Ticket(String event_id){
        UUID unique_id = UUID.randomUUID();
        this.id = unique_id.toString();
        this.event_id = event_id;
    }
}
