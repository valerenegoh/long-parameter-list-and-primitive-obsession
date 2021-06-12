package com.thoughtworks.twu;

import java.util.List;

public class NumberCruncher {
    private final List<Integer> numbers;

    public NumberCruncher(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int countEven() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) count++;
        }
        return count;
    }

    public int countOdd() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 1) count++;
        }
        return count;
    }

    public int countPositive() {
        int count = 0;
        for (int number : numbers) {
            if (number >= 0) count++;
        }
        return count;
    }

    public int countNegative() {
        int count = 0;
        for (int number : numbers) {
            if (number < 0) count++;
        }
        return count;
    }
}
