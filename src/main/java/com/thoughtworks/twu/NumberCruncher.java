package com.thoughtworks.twu;

import java.util.List;

public class NumberCruncher {
    private final List<Integer> numbers;
    private int even;
    private int odd;
    private int positive;
    private int negative;

    public NumberCruncher(List<Integer> numbers) {
        this.numbers = numbers;
        countAll();
    }

    private void countAll() {
        for (int number : numbers) {
            if (number % 2 == 0) even++;
            if (number % 2 == 1) odd++;
            if (number >= 0) positive++;
            if (number < 0) negative++;
        }
    }

    public int countEven() {
        return even;
    }

    public int countOdd() {
        return odd;
    }

    public int countPositive() {
        return positive;
    }

    public int countNegative() {
        return negative;
    }
}