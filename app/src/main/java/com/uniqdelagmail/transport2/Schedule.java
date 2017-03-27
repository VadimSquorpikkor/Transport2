package com.uniqdelagmail.transport2;

import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by SquorpikkoR on 28.09.2016.
 */
public class Schedule{

    //static int timeLeft;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String number;

    private  int[][] schedule;// = new int[][];

    public int[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(int[][] schedule) {
        this.schedule = schedule;
    }

    public Schedule(int[][] schedule, String number) {
        this.schedule = schedule;
        this.number = number;

    }

    public Schedule() {
    }

    //region OLD VERSION
    /*public  ScheduleTime nearestTime() {
        ScheduleTime nearestTime;
        int hour;
        int minute;
        int time = currentTime()[0] *60 +  currentTime()[1];
        for(int i = 0; i < schedule.length; i++) {
            if (time <= schedule[0][i] *60 +  schedule[11][i]) {
                return new ScheduleTime(schedule[0][i], schedule[1][i]);
            }
        }
        return new ScheduleTime(schedule[0][0], schedule[1][0]);
    }*/
//переделатт метод nearest, параметры методу не нужны
    //ьудеи браит из обьекта. А принтер будет иметь только параметр
    //номер блока полей и пример schedule_30.print(1)
    /*public  void nearestTime(TextView textNumber, TextView textMinLeft, TextView textTimeGone) {
        String goneTime;
        int minLeft;
        int time = currentTime()[0] *60 +  currentTime()[1];
        int timeWhenGone;
        for(int i = 0; i < schedule.length; i++) {
            timeWhenGone = schedule[i][0] *60 +  schedule[i][1];
            if (time <= timeWhenGone) {
                minLeft = timeWhenGone - time;
                goneTime = schedule[i][0] + ":" + schedule[i][1];
                Printer.moveData(number, minLeft, goneTime, textNumber, textMinLeft, textTimeGone);
                break;
            }
        }
    }*/
    //endregion

    public TransportTime nearestTime() {
        TransportTime transportTime;
        int minLeft;
        int time = currentTime()[0] *60 +  currentTime()[1];
        int timeWhenGone;
        for(int i = 0; i < schedule.length; i++) {
            timeWhenGone = schedule[i][0] *60 +  schedule[i][1];
            if (time <= timeWhenGone) {
                minLeft = timeWhenGone - time;
                //timeLeft = minLeft;
                transportTime = new TransportTime(number, schedule[i][0], schedule[i][1], minLeft, false);
                return transportTime;
            }
        }
        transportTime = new TransportTime(number, schedule[0][0], schedule[0][1],true);
        return transportTime;
    }



    private int[] currentTime() {
        int[] time = new int[2];
        Calendar c = new GregorianCalendar();
        int mHour = c.get(Calendar.HOUR_OF_DAY);
        int mMinute = c.get(Calendar.MINUTE);
        time[0] = mHour;
        time[1] = mMinute;
        return time;
    }

}
