package com.uniqdelagmail.transport2;

/**
 * Created by SquorpikkoR on 30.09.2016.
 */
public class TransportTime {

    private int hour;
    private int minute;
    private int timeLeft;
    //private String minText;//текст отображаемый вместе с минутами
    private String solution;//
    private boolean isLast;
    private String busNumber;


    public TransportTime(String busNumber, int hour, int minute, int timeLeft, boolean isLast) {
        this.busNumber = busNumber;
        this.hour = hour;
        this.minute = minute;
        this.timeLeft = timeLeft;
        this.isLast = isLast;
    }

    public TransportTime(String busNumber, int hour, int minute, boolean isLast) {
        this.busNumber = busNumber;
        this.hour = hour;
        this.minute = minute;
        this.isLast = isLast;
    }

    private String minuteRightValue() {
        String minuteRightValue;
        switch (timeLeft) {
            case 1:
            case 21:
            case 31:
            case 41:
            case 51:
            case 61:
            case 71:
            case 81:
            case 91:
            case 101:minuteRightValue = "минута";break;
            case 2:
            case 3:
            case 4:
            case 22:
            case 23:
            case 24:
            case 32:
            case 33:
            case 34:
            case 42:
            case 43:
            case 44:
            case 52:
            case 53:
            case 54:
            case 62:
            case 63:
            case 64:minuteRightValue = "минуты";break;
            default: minuteRightValue = "минут";
        }
        return minuteRightValue;
    }

    public String minLeftText() {
        return timeLeft + " " + minuteRightValue();
    }

    public String timeWhenGoneText() {
        return hour + ":" + minute;
    }

    public String getBusNumber() {
        return busNumber;
    }
}
