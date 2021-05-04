package com.thoughtworks.twu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCruncherTest {

    @Test
    public void shouldCountEvenNumbers() {
        int evens = new NumberCruncher(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).countEven();
        assertEquals(evens, 5);
    }

    @Test
    public void shouldCountOddNumbers() {
        int odds = new NumberCruncher(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).countOdd();
        assertEquals(odds, 6);
    }

    @Test
    public void shouldCountPositiveNumbers() {
        int positives = new NumberCruncher(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4).countPositive();
        assertEquals(positives, 5);
    }

    @Test
    public void shouldCountNegativeNumbers() {
        int negatives = new NumberCruncher(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4).countNegative();
        assertEquals(negatives, 5);
    }
}
