package com.dsalgo.recursion;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TowersOfHanoiTest {

    private final TowersOfHanoi towersOfHanoi = new TowersOfHanoi();

    @Test
    void shouldMoveDiscsToDestinationTower() {
        int numberOfDiscs = 3;
        ArrayList<Integer> sourceTower = new ArrayList<>(numberOfDiscs);
        sourceTower.add(0, 3);
        sourceTower.add(1, 2);
        sourceTower.add(2, 1);

        ArrayList<Integer> auxTower = new ArrayList<>(numberOfDiscs);
        ArrayList<Integer> destinationTower = new ArrayList<>(numberOfDiscs);

        towersOfHanoi.towersOfHanoi(numberOfDiscs, sourceTower, auxTower, destinationTower);

    }

    @Test
    void shouldMoveDirectlyFromSourceToDestinationIfTowersHaveOneDisc() {
        int numberOfDiscs = 1;
        ArrayList<Integer> sourceTower = new ArrayList<>(numberOfDiscs);
        sourceTower.add(0, 3);
        System.out.println(sourceTower);

        ArrayList<Integer> auxTower = new ArrayList<>(numberOfDiscs);
        ArrayList<Integer> destinationTower = new ArrayList<>(numberOfDiscs);

        towersOfHanoi.towersOfHanoi(numberOfDiscs,sourceTower, auxTower, destinationTower);

        Assertions.assertEquals(sourceTower.size(), 0);
        Assertions.assertEquals(destinationTower.size(), 1);
        Assertions.assertEquals(destinationTower.size(), 1);
    }

}