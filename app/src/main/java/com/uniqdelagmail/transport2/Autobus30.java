package com.uniqdelagmail.transport2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by SquorpikkoR on 27.09.2016.
 */
public class Autobus30 {
    private  int[][] schedule = new int[][]{
            {5,53},
            {6,7},{6,21},{6,35},{6,49},
            {7,3},{7,18},{7,32},{7,46},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
            {},{},{},{},
    };

    public  ScheduleTime nearestTime() {
        ScheduleTime nearestTime;
        int hour;
        int minute;
        int time = currentTime()[0] * currentTime()[1];
        for(int i = 0; i < schedule.length; i++) {
            if (time <= schedule[0][i] * schedule[11][i]) {
                return new ScheduleTime(schedule[0][i], schedule[1][i]);
            }
        }
        return new ScheduleTime(schedule[0][0], schedule[1][0]);
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

