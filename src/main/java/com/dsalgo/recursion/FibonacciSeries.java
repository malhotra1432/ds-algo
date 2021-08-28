package com.dsalgo.recursion;

public class FibonacciSeries {
    public int fibonacciSeries(int givenNumber) {
        if (givenNumber <= 1) {
            return givenNumber;
        }
        return fibonacciSeries(givenNumber - 1) + fibonacciSeries(givenNumber - 2);
    }
}
