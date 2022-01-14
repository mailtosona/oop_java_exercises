package com.techreturners.cats;

public class DomesticCat extends ParentCat implements Cat{
    public final String DOMESTIC = "domestic";
    public final int HEIGHT = 23;
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
        return DOMESTIC;
    }
    public int getAverageHeight() {
        return HEIGHT;
    }
    public String eat() {
        return "Purrrrrrr";
    }
    public String randomlyeat() {
        return "It will do I suppose";
    }

}
