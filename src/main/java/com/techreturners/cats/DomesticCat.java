package com.techreturners.cats;

public class DomesticCat extends ParentCat implements Cat {
    public DomesticCat() {
        super("domestic");
        super.HEIGHT = 23;
    }
    public String eat() {
        return "Purrrrrrr";
    }
    public String randomlyEat() {
        return "It will do I suppose";
    }

}
