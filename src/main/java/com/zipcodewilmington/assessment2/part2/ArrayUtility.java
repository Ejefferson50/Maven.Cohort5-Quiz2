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
        int occurrences1 = 0;
        int occurrences2 = 0;
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] == valueToEvaluate) {
                occurrences1 = occurrences1 + 1;
            }
        }

        for (int index = 0; index < array2.length; index++) {
            if (array2[index] == valueToEvaluate) {
                occurrences2 = occurrences2 + 1;
            }
        }
        return occurrences1 + occurrences2;

    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
