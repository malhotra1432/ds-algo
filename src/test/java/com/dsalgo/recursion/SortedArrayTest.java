package com.dsalgo.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayTest {

    @Test
    void shouldCheckWhetherArrayHasSortedOrder(){
        ArrayList<Integer> givenIntArray = new ArrayList<>(Arrays.asList(33,20,34,12,32,11));

        System.out.println(givenIntArray);;

        ArrayList<Integer> expectedIntArray = new ArrayList<>(Arrays.asList(11,12,20,32,33,34));

//        Assertions.assertEquals(givenIntArray,);
    }

}