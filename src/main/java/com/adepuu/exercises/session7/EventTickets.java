package com.adepuu.exercises.session7;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EventTickets {
    private Map<UUID, Ticket> tickets = new HashMap<>();

    public void createTicket(String eventName, double price) {
        Ticket ticket = new Ticket(eventName, price);
        tickets.put(ticket.getId(), ticket);
        System.out.println("Ticket created successfully. ID: " + ticket.getId());
    }

    public void bookTicket(UUID ticketId) {
        Ticket ticket = tickets.get(ticketId);
        if (ticket != null && ticket.isAvailable()) {
            ticket.book();
            System.out.println("Ticket booked successfully.");
        } else {
            System.out.println("Ticket is not available.");
        }
    }

    public void validateTicket(UUID ticketId) {
        Ticket ticket = tickets.get(ticketId);
        if (ticket != null) {
            if (ticket.isAvailable()) {
                System.out.println("Ticket is available.");
            } else {
                System.out.println("Ticket has already been booked.");
            }
        } else {
            System.out.println("Ticket not found.");
        }
    }

    // Additional methods for managing tickets, such as ticket confirmation, cancellation, etc.
}
