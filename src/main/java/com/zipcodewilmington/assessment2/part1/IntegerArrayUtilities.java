package com.zipcodewilmington.assessment2.part1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class IntegerArrayUtilities {
    Boolean testBoo;
    Integer testInteger = 0;

    public Boolean hasEvenLength(Integer[] array) {
        testBoo = array.length % 2 == 0;
        return testBoo;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = start; i <= stop; i++){
            results.add(i);

        }
        return results.toArray(new Integer[results.size()]);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return testInteger = array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return testInteger = array[0] * array[1];
    }
}
