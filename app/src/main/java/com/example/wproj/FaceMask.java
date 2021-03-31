package com.example.wproj;

public class FaceMask {
    private String name;
    private int time = 0;
    private String condition = "Świeża";

    public FaceMask(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {

        this.time = time;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(int time) {
        this.time = time;

        if(time > 50 && time < 70) {
            this.condition = "Nieświeża";
        }
        if(time > 70 && time < 90) {
            this.condition = "Do wymiany!";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
