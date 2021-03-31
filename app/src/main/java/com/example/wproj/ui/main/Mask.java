package com.example.wproj.ui.main;

public class Mask {

    private int time;
    private String condition;
    private String name;

    public Mask(String name, String condition, int time) {
        this.name = name;
        this.condition = condition;
        this.time = time;
    }

    public void setTime(int wTime) {
        time = time + wTime;
    }

    public void setCondition() {

        if (this.time <= 1000) {
            this.condition = "OK";
        } else if (this.time > 1000 && this.time <= 2000) {
            this.condition = "Lekko znoszona";
        }
        else if (this.time > 2000) {
            this.condition = "Zużyta";
        }

    }

    public int getTime() {
        return time;
    }

    public String getCondition() {
        return condition;
    }

    public String getName() {
        return name;
    }
}