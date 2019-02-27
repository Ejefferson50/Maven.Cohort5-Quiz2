package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayUtility {
    Integer[] result;
    ArrayList<Integer> resultList;

    public Integer[] merge(Integer[] array1, Integer[] array2) {
       resultList.addAll(Arrays.asList(array1));
       resultList.addAll(Arrays.asList(array2));
       return resultList.toArray(result);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
