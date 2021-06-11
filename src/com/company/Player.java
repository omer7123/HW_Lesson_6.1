package com.company;

public class Player {
    private int damagePeople;
    private int healthPeople;

    public Player(int damagePeople, int healthPeople) {
        this.damagePeople = damagePeople;
        this.healthPeople = healthPeople;
    }

    public int getDamagePeople() {
        return damagePeople;
    }

    public void setDamagePeople(int damagePeople) {
        this.damagePeople = damagePeople;
    }

    public int getHealthPeople() {
        return healthPeople;
    }

    public void setHealthPeople(int healthPeople) {
        this.healthPeople = healthPeople;
    }
}
