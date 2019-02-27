package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2) {
        int compareSpeed = 0;

        if (animal1.getSpeed() == animal2.getSpeed()) {
            compareSpeed = 0;
        }

        if (animal1.getSpeed() > animal2.getSpeed()) {
            compareSpeed = -1;
        }

        if (animal1.getSpeed() < animal2.getSpeed()) {
            compareSpeed = 1;
        }



        return compareSpeed;
    }
}
