package com.adepuu.exercises.session7;

public class Event {
    private String name;
    private String venue;
    private String date;
    private int maxTicket;

    public Event(String name, String venue, String date, int maxTicket){
        this.name = name;
        this.venue = venue;
        this.date = date;
        this.maxTicket = maxTicket;
    }

    public void createEvent(){
        System.out.println("Event for: ");
        System.out.println("Name: " + name);
        System.out.println("venue: " + venue);
        System.out.println("date: " + date);
        System.out.println("maxTicket: " + maxTicket);
    }

}
