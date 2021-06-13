package com.company;

public class Warrior extends Player {
    private int attackTypeHero;
    private int speed;
    public void having(){
        System.out.println("Warrior have shield and sword");
    }

    public Warrior(int damagePeople, int healthPeople, int attackTypeHero, int speed) {
        super(damagePeople, healthPeople);
        this.attackTypeHero = attackTypeHero;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackTypeHero() {
        return attackTypeHero;
    }

    public void setAttackTypeHero(int attackTypeHero) {
        this.attackTypeHero = attackTypeHero;
    }
}
