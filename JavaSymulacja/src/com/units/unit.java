package com.units;

import java.util.Random;
import java.util.TimerTask;

public class unit extends TimerTask {
    private int position_x;
    private int position_y;
    private int health;

    Random random = new Random();

    public unit(int x, int y, int health) {
        this.position_x = x;
        this.position_y = y;
        this.health = health;
    }

    public void setPosition_x(int x){
        this.position_x = this.position_x + x;
    }
    public void setPosition_y(int y){
        this.position_y = this.position_y + y;
    }
    public void getPosition(){
        System.out.println("POZYCJA Y: "+ this.position_y + " POZYCJA X: " + this.position_x);
    }
    public int getPosition_y(){
        return this.position_y;
    }

    @Override
    public void run() {
        this.setPosition_y(random.nextInt(2));
        this.setPosition_x(random.nextInt(2));
        this.getPosition();
    }
}
