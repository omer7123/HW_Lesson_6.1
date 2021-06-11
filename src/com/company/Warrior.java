package com.company;

public class Warrior extends Player {
    private int attackTypeHero;

    public Warrior(int damagePeople, int healthPeople, int attackTypeHero) {
        super(damagePeople, healthPeople);
        this.attackTypeHero = attackTypeHero;
    }

    public int getAttackTypeHero() {
        return attackTypeHero;
    }

    public void setAttackTypeHero(int attackTypeHero) {
        this.attackTypeHero = attackTypeHero;
    }
}
