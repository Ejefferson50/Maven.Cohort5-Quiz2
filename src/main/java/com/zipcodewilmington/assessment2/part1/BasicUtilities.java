package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {

    Boolean test;

    public Boolean isGreaterThan5(Integer value) {
        test = value >= 5;

        return test;
    }

    public Boolean isLessThan7(Integer value) {
        test = value <= 7;
        return test;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        test = valueToEvaluate >= 5 && valueToEvaluate <= 7;

        return test;
    }

    public Boolean startsWith(String string, Character character) {

        test = string.startsWith(character.toString().toLowerCase()) || string.startsWith(character.toString().toUpperCase()) ;

        return test;
    }
}
