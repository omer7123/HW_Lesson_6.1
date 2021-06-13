package com.company;

public class Mental extends Magical{
    private int intellect;

    public Mental(int damagePeople, int healthPeople, int attackTypeHero, int speed, int power, int intellect) {
        super(damagePeople, healthPeople, attackTypeHero, speed, power);
        this.intellect = intellect;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void having() {
        System.out.println("Mental have a big brain");
    }

}

