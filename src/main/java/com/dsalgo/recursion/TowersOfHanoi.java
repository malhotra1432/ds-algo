package com.dsalgo.recursion;

import java.util.ArrayList;

public class TowersOfHanoi {

    public ArrayList<Integer> towersOfHanoi(int numberOfDiscs, ArrayList<Integer> sourceTower, ArrayList<Integer> auxTower, ArrayList<Integer> destinationTower) {
        if (sourceTower.size() == 1) {
            destinationTower.add(0, sourceTower.get(0));
            System.out.println("Moving " + sourceTower.get(0) + " from sourceTower to destinationTower");
            sourceTower.remove(0);
        }
//        towersOfHanoi(numberOfDiscs - 1, sourceTower, auxTower, destinationTower);
        destinationTower.add(0, sourceTower.get(numberOfDiscs - 1));
        sourceTower.remove(numberOfDiscs -1);
        destinationTower.add(0, sourceTower.get(numberOfDiscs - 1));
        System.out.println("destinationTower => " + destinationTower);
        return destinationTower;
    }
}
