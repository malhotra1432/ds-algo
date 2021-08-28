package com.dsalgo.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciSeriesTest {

    FibonacciSeries fibonacciSeries = new FibonacciSeries();

    @Test
    void shouldFindFibonacciSeriesForTheGivenNumber() {
        int givenNumber = 6;

        var actual = fibonacciSeries.fibonacciSeries(givenNumber);
        Assertions.assertEquals(8, actual);
    }

    @Test
    void shouldFindFibonacciSeriesWhenTheGivenNumberIsZero() {
        int givenNumber = 0;

        var actual = fibonacciSeries.fibonacciSeries(givenNumber);
        Assertions.assertEquals(0, actual);
    }

    @Test
    void shouldFindFibonacciSeriesWhenTheGivenNumberIsOne() {
        int givenNumber = 1;

        var actual = fibonacciSeries.fibonacciSeries(givenNumber);
        Assertions.assertEquals(1, actual);
    }

}