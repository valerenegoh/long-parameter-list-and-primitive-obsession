package com.thoughtworks.twu;

import java.util.List;

public class NumberCruncher {
    private final List<Integer> numbers;
    public NumberCruncher(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int count(NumberType numberType) {
        return numberType.count(numbers);
    }
}