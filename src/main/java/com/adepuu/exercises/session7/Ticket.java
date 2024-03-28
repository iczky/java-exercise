package com.adepuu.exercises.session7;

import java.util.UUID;

public class Ticket {
    private UUID id;
    private String eventName;
    private double price;
    private boolean available;

    public Ticket(String eventName, double price) {
        this.id = UUID.randomUUID();
        this.eventName = eventName;
        this.price = price;
        this.available = true;
    }

    public UUID getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void book() {
        available = false;
    }

    public void confirm() {
        // Implementation for confirmation, if needed
    }

    // Optional: More methods for ticket management
}
