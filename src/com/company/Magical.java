package com.company;

public class Magical extends Warrior {
    private int power;

    public Magical(int damagePeople, int healthPeople, int attackTypeHero, int speed, int power) {
        super(damagePeople, healthPeople, attackTypeHero, speed);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void having() {
        System.out.println("Magical have magic hands");
    }
}
