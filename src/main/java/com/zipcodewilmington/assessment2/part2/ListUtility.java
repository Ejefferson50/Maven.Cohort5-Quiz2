package com.zipcodewilmington.assessment2.part2;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List list = new ArrayList();
    public Boolean add(int i) {
        list.add(i);

        return list.contains(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
       return null;

    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return null;
    }
}
