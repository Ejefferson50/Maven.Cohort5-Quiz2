package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ArrayUtility {
    Integer[] result;
    ArrayList<Integer> resultPart1;
    ArrayList<Integer> resultPart2;

    public Integer[] merge(Integer[] array1, Integer[] array2) {
      ArrayList<Integer> resultPart1 = new ArrayList<>(Arrays.asList(array1));
        ArrayList<Integer> resultPart2 = new ArrayList<>(Arrays.asList(array2));

        resultPart1.addAll(resultPart2);
        return resultPart1.toArray(new Integer[resultPart1.size()]);

    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] newArray = new Integer[array.length];

        for(int i = array.length - 1; i >= 0; i-- ){
            int newPositionOfIndex = i - index;
            if (newPositionOfIndex >= 0 && newPositionOfIndex < array.length) {
                newArray[newPositionOfIndex] = array[i];
            }else if (newPositionOfIndex < 0)
            { newArray[newPositionOfIndex + array.length] = array[i];
            }
            }
        return newArray;
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

    public static Integer mostCommon(Integer[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        Integer frequentOccurrences = arrayList.get(0);

        for (Integer i : arrayList){
            if(Collections.frequency(arrayList,i) > Collections.frequency(arrayList, frequentOccurrences)){
                frequentOccurrences = arrayList.get(i);
            }

        }

        return frequentOccurrences;
    }
}
