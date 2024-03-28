package com.adepuu.exercises.session7;

public class TicketCreation {
    private int id;
    private String eventName;
    private int price;
    private boolean bookingStatus = false;

    public TicketCreation(int id, String eventName, int price){
        this.setId(id);
        this.setEventName(eventName);
        this.setPrice(price);
    }

    public TicketCreation(int id, String eventName, int price, boolean bookingStatus){
        this.setId(id);
        this.setEventName(eventName);
        this.setPrice(price);
        this.setBookingStatus(bookingStatus);
    }

    public void createTicket(){
        System.out.println("Print ticket with: id: " + getId() + ": Event: " + getEventName() + ": price: " + getPrice());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}
