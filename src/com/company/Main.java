package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior war1 = new Warrior(5, 10, 56, 5);
        Magical magic = new Magical(5, 10, 51, 15, 2);
        Mental ment = new Mental(5, 10, 15, 57, 10, 20);
        System.out.println("Скорость обычного мечника: " + war1.getSpeed());
        System.out.println("Скорость мага: " + magic.getSpeed() + ", Мощь: " + magic.getPower());
        System.out.println("Скорость ментала: " + ment.getSpeed() + ", Мощь: " + ment.getPower() +
                            ", интеллект: " + ment.getIntellect());
        System.out.println();
        war1.having();
        magic.having();
        ment.having();

    }
}
