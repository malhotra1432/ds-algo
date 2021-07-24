package com.dsalgo.recursion;

public class Factorial {

  public long factorial(long number) {
    if (number == 0) {
      return 1;
    } else if (number < 0) {
      throw new ArithmeticException("Factorial is undefined for negative numbers");
    } else {
      return number * factorial(number - 1);
    }
  }
}
