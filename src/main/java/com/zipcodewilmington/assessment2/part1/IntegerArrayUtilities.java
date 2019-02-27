package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;

public class IntegerArrayUtilities {
    Boolean testBoo;
    Integer testInteger = 0;
    Integer[] testArray;
    public Boolean hasEvenLength(Integer[] array) {
        testBoo = array.length % 2 == 0;
        return testBoo;
    }

    public Integer[] range(int start, int stop) {

        for (int index = start; index < stop; index++){
            testArray[index]++;
        }

        return testArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return testInteger = array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return testInteger = array[0] * array[1];
    }
}
