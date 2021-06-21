package com.thoughtworks.twu;

import java.util.List;

public enum NumberType {
    EVEN {
        @Override
        public int count(List<Integer> numbers) {
            return (int) numbers.stream().filter(x -> x % 2 == 0).count();
        }
    },
    ODD {
        @Override
        public int count(List<Integer> numbers) {
            return (int) numbers.stream().filter(x -> x % 2 == 1).count();
        }
    },
    POSITIVE {
        @Override
        public int count(List<Integer> numbers) {
            return (int) numbers.stream().filter(x -> x >= 0).count();
        }
    },
    NEGATIVE {
        @Override
        public int count(List<Integer> numbers) {
            return (int) numbers.stream().filter(x -> x < 0).count();
        }
    };
    public abstract int count(List<Integer> numbers);
}
