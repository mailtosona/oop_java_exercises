package com.techreturners.cats;

public class LionCat extends ParentCat implements Cat {
    public LionCat() {
        super("wild");
        super.HEIGHT = 1100;
    }
    public String eat() {return "Roar!!!!";}
    public String randomlyEat() {return "It will do I suppose";}
}
