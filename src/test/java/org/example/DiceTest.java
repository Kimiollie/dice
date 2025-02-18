package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testRoll() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6);
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6);
    }

    @Test
    public void testIsDoubles() {
        Dice dice = new Dice();
        boolean foundDouble = false;
        for (int i = 0; i < 100; i++) {
            dice.roll();
            if (dice.isDoubles()) {
                foundDouble = true;
                break;
            }
        }
        assertTrue(foundDouble);
    }

    @Test
    public void testRollCount() {
        Dice dice = new Dice();
        int initialCount = dice.getRollCount();
        dice.roll();
        assertEquals(initialCount + 1, dice.getRollCount());
    }
}