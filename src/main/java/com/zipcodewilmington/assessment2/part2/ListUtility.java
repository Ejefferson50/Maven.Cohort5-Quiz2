package com.zipcodewilmington.assessment2.part2;


import java.util.ArrayList;
import java.util.List;


public class ListUtility {
    List<Integer> list;

    public ListUtility(){
        list = new ArrayList();

    }

    public Boolean add(Integer i) {


        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> checkArr = new ArrayList();
        for (Integer i : list) {
            if (!checkArr.contains(i)) {
                checkArr.add(i);
            }
        }
        return checkArr;
    }

    public String join() {


        return list.toString().substring(1, list.toString().length() - 1);

    }

    public Integer mostCommon() {
        //return ArrayUtility.mostCommon(ArrayList.ArrayList<Integer>.toArray(new Integer[checkArr.size()]));
        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}
