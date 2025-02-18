package org.example;

public class Dice {
    private int die1;
    private int die2;
    private int rollCount;

    public Dice() {
        rollCount = 0;
    }

    public void roll() {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
        rollCount++;
    }

    public boolean isDoubles() {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public int getRollCount() {
        return rollCount;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println("Rolling the dice...");
        do {
            dice.roll();
            System.out.println("Die 1: " + dice.getDie1());
            System.out.println("Die 2: " + dice.getDie2());
        } while (!dice.isDoubles());
        System.out.println("You rolled a double!");
        System.out.println("After " + dice.getRollCount() + " try both reach the same value");
    }
}
