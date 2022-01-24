package com.techreturners.cats;

public class CheetahCat extends ParentCat implements Cat {
    public CheetahCat() {
        super("wild");
        super.HEIGHT = 1100;
    }
    public String eat() {
        return "Zzzzzzz";
    }
    public String randomlyEat() {
        return "It will do I suppose";
    }
}
