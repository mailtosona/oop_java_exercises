package com.techreturners.cats;

public class CheetahCat extends ParentCat implements Cat{
    public final String WILD = "wild";
    public final int HEIGHT = 1100;
    public boolean isAsleep() {
        return super.isAsleep();
    }
    public void goToSleep() {
        setAsleep(true);
    }
    public void wakeUp() {
        setAsleep(false);
    }
    public String getSetting() {
        return WILD;
    }
    public int getAverageHeight() {
        return HEIGHT;
    }
    public String eat() {
        return "Zzzzzzz";
    }
    public String randomlyeat() {
        return "It will do I suppose";
    }
}
