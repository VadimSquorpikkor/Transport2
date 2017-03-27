package com.uniqdelagmail.transport2;

/**
 * Created by SquorpikkoR on 27.09.2016.
 */
public class ScheduleTime {
    private int hours;
    private int minutes;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {

        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public ScheduleTime(int hour, int minute) {
        setHours(hour);
        setMinutes(minute);
    }


}

