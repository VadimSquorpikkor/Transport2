package com.uniqdelagmail.transport2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

    int[][] bus_30 = new int[][]{
            {5,53},
            {6,7},{6,21},{6,35},{6,49},
            {7,3},{7,18},{7,32},{7,46},
            {8,0},{8,14},{8,28},{8,42},{8,57},
            {9,17},{9,32},{9,47},
            {10,10},{10,33},{10,57},
            {11,20},{11,44},
            {12,8},{12,32},{12,56},
            {13,20},{13,43},
            {14,7},{14,30},{14,55},
            {15,20},{15,44},
            {16,9},{16,32},{16,46},
            {17,0},{17,14},{17,28},{17,43},
            {18,0},{18,13},{18,28},{18,44},
            {19,1},{19,25},{19,51},
            {20,17},{20,44},
            {21,10},{21,35},
            {22,2},{22,29},{22,53},
            {23,16},{23,39},
            {24,2},{24,27}
    };

    int[][] bus_28 = new int[][]{
            {5,36},{5,56},
            {6,13},{6,33},{6,50},
            {7,8},{7,27},{7,47},
            {8,4},{8,22},{8,39},{8,57},
            {9,16},{9,32},{9,48},
            {10,7},{10,25},{10,43},
            {11,5},{11,28},{11,51},
            {12,13},{12,35},{12,57},
            {13,19},{13,41},
            {14,3},{14,25},{14,47},
            {15,9},{15,32},{15,56},
            {16,19},{16,42},
            {17,2},{17,22},{17,40},{17,59},
            {18,17},{18,37},{18,55},
            {19,14},{19,33},{19,54},
            {20,15},{20,34},{20,53},
            {21,15},{21,38},
            {22,2},{22,25},{22,49},
            {23,13},{23,37},
            {24,2}
    };

    int[][] bus_104 = new int[][]{
            {5,44},{5,56},
            {6,8},{6,20},{6,32},{6,44},{6,54},
            {7,4},{7,14},{7,24},{7,33},{7,41},{7,49},{7,57},
            {8,6},{8,15},{8,24},{8,33},{8,43},{8,52},
            {9,2},{9,11},{9,20},{9,28},{9,38},{9,56},
            {10,16},{10,36},{10,56},
            {11,16},{11,38},
            {12,1},{12,24},{12,47},
            {13,10},{13,33},{13,54},
            {14,14},{14,34},{14,53},
            {15,12},{15,23},{15,33},{15,42},{15,54},
            {16,6},{16,17},{16,28},{16,39},{16,50},
            {17,1},{17,10},{17,19},{17,34},{17,49},
            {18,5},{18,23},{18,41},{18,59},
            {19,17},{19,35},{19,58},
            {20,20},{20,43},{20,55},
            {21,8},{21,30},{21,52},
            {22,14},{22,37},
            {23,0},{23,27},{23,45},
            {24,5}
    };

    int[][] bus_97 = new int[][]{
            {5,52},
            {6,6},{6,18},{6,27},{6,38},{6,48},{6,57},
            {7,9},{7,18},{7,28},{7,38},{7,47},{7,58},
            {8,8},{8,17},{8,28},{8,36},{8,46},{8,56},
            {9,9},{9,22},{9,32},{9,44},{9,56},
            {15,17},{15,29},{15,43},{15,55},
            {16,4},{16,15},{16,25},{16,40},{16,51},
            {17,1},{17,13},{17,28},{17,36},{17,50},
            {18,5},{18,14},{18,26},{18,37},{18,49},
            {19,2},{19,20},{19,40},
            {24,50}
    };

    Schedule schedule_28 = new Schedule(bus_28, "28");
    Schedule schedule_30 = new Schedule(bus_30, "30c");
    Schedule schedule_104 = new Schedule(bus_104, "104");
    Schedule schedule_97 = new Schedule(bus_97, "97");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stationTitle = (TextView) findViewById(R.id.stationTitle);
        solution = (TextView) findViewById(R.id.solution);
        busNumber = (TextView) findViewById(R.id.busNumber);
        minLeft = (TextView) findViewById(R.id.minLeft);
        timeWhenGone = (TextView) findViewById(R.id.timeWhenGone);
        smallBusNumber = (TextView) findViewById(R.id.smallBusNumber);
        smallMinLeft = (TextView) findViewById(R.id.smallMi1nLeft);
        smallTimeWhenGone = (TextView) findViewById(R.id.smallTimeWhenGone);
        smallBusNumber2 = (TextView) findViewById(R.id.smallBusNumber2);
        smallMinLeft2 = (TextView) findViewById(R.id.smallMi1nLeft2);
        smallTimeWhenGone2 = (TextView) findViewById(R.id.smallTimeWhenGone2);
        smallBusNumber3 = (TextView) findViewById(R.id.smallBusNumber3);
        smallMinLeft3 = (TextView) findViewById(R.id.smallMi1nLeft3);
        smallTimeWhenGone3 = (TextView) findViewById(R.id.smallTimeWhenGone3);


    }

        @Override
        protected void onResume() {
            super.onResume();

            Printer.moveData(schedule_30.nearestTime(), busNumber, minLeft, timeWhenGone);
            Printer.moveData(schedule_28.nearestTime(), smallBusNumber, smallMinLeft, smallTimeWhenGone);
            Printer.moveData(schedule_104.nearestTime(), smallBusNumber2, smallMinLeft2, smallTimeWhenGone2);
            Printer.moveData(schedule_97.nearestTime(), smallBusNumber3, smallMinLeft3, smallTimeWhenGone3);
        }

    }



