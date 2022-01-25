package com.techreturners.cats;

public abstract class ParentCat {
    private boolean isAsleep = false;
    protected String SETTING;
    protected int HEIGHT;
    public ParentCat(String setting) {this.SETTING = setting;}
    public ParentCat(int height) {this.HEIGHT = height;}

  //  public ParentCat(String setting, int height) {this.SETTING = setting; this.HEIGHT = height;}

    public boolean isAsleep() {
        return isAsleep;
    }
    public void setAsleep(boolean isAsleep) {
        this.isAsleep = isAsleep;
    }
    public void goToSleep() {
        setAsleep(true);
    }
    public void wakeUp() {
        setAsleep(false);
    }
    public String getSetting() {
        return SETTING;
    }
    public int getAverageHeight() {
        return HEIGHT;
    }
}
