package com.company;

import com.units.unit;


import java.util.Timer;
import java.time.*;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        unit unit_1 = new unit(0, 0, 12);
        unit_1.setPosition_y(2);
        unit unit_2 = new unit(5, 5, 12);

        Timer timer = new Timer();
        timer.schedule(unit_1, 0, 1000);

        while(true) if (unit_1.getPosition_y() > 3) {
            timer.cancel();
            timer.purge();

        }

    }

}