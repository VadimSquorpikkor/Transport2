package com.uniqdelagmail.transport2;

import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//Created by SquorpikkoR on 29.09.2016.

public class Printer{

    TextView stationTitle;
    TextView solution;
    TextView busNumber;
    TextView minLeft;
    TextView timeWhenGone;
    TextView smallBusNumber;
    TextView smallMinLeft;
    TextView smallTimeWhenGone;
    TextView smallBusNumber2;
    TextView smallMinLeft2;
    TextView smallTimeWhenGone2;
    TextView smallBusNumber3;
    TextView smallMinLeft3;
    TextView smallTimeWhenGone3;

    /*public static void moveData(String number,
                                int minLeft,
                                String timeWhenGone,
                                TextView textNumber,
                                TextView textViewMinLeft,
                                TextView textViewTimeWhenGone) {
        textViewMinLeft.setText(String.valueOf(minLeft));
        textViewTimeWhenGone.setText(timeWhenGone);
        textNumber.setText(number);

    }*/

    public static void moveData(TransportTime transportTime,
                                TextView textNumber,
                                TextView textViewMinLeft,
                                TextView textViewTimeWhenGone) {
        textViewMinLeft.setText(transportTime.minLeftText());
        textViewTimeWhenGone.setText(transportTime.timeWhenGoneText());
        textNumber.setText(transportTime.getBusNumber());

    }
}
