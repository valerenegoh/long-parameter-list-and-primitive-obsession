package com.thoughtworks.twu;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCruncherTest {

    @Test
    public void shouldCountEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int evens = new NumberCruncher(numbers).count(NumberType.EVEN);
        assertEquals(evens, 5);
    }

    @Test
    public void shouldCountOddNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int odds = new NumberCruncher(numbers).count(NumberType.ODD);
        assertEquals(odds, 6);
    }

    @Test
    public void shouldCountPositiveNumbers() {
        List<Integer> numbers = List.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4);
        int positives = new NumberCruncher(numbers).count(NumberType.POSITIVE);
        assertEquals(positives, 5);
    }

    @Test
    public void shouldCountNegativeNumbers() {
        List<Integer> numbers = List.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4);
        int negatives = new NumberCruncher(numbers).count(NumberType.NEGATIVE);
        assertEquals(negatives, 5);
    }
}