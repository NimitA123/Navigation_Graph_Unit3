package com.example.navigation_graph_unit3;

import java.io.Serializable;

public class Model implements Serializable {
    private String event_Title1;
    private String event_Description;
    private String Start_Date1;
    private String End_Date1;
    private String Start_Time1;
    private String End_Time1;
    private int Currency;
    private int Price;

    public String getEvent_Title1() {
        return event_Title1;
    }

    public String getEvent_Description() {
        return event_Description;
    }

    public String getStart_Date1() {
        return Start_Date1;
    }

    public String getEnd_Date1() {
        return End_Date1;
    }

    public String getStart_Time1() {
        return Start_Time1;
    }

    public String getEnd_Time1() {
        return End_Time1;
    }

    public int getCurrency() {
        return Currency;
    }

    public int getPrice() {
        return Price;
    }

    public Model (String event_Title1, String event_Description, String start_Date1, String end_Date1, String start_Time1, String end_Time1, int currency, int price) {
        this.event_Title1 = event_Title1;
        this.event_Description = event_Description;
        Start_Date1 = start_Date1;
        End_Date1 = end_Date1;
        Start_Time1 = start_Time1;
        End_Time1 = end_Time1;
        Currency = currency;
        Price = price;
    }
}
