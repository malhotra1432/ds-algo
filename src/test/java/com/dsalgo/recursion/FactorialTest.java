package com.dsalgo.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

  private final Factorial factorial = new Factorial();

  @Test
  void shouldReturnFactorialForBaseCase() {
    var number = 0;
    var expectedOutput = 1;
    var actualOutput = factorial.factorial(number);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void shouldReturnFactorialForGivenNumber() {
    var number = 3;
    var expectedOutput = 6;
    var actualOutput = factorial.factorial(number);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void shouldThrowExceptionForNegativeNumbers() {
    var number = -3;
    assertThrows(
        ArithmeticException.class,
        () -> {
          factorial.factorial(number);
        });
  }
}
