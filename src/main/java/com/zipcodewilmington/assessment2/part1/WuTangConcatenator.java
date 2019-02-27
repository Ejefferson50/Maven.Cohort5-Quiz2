package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Boolean testboo;
    Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;

    }


    public Boolean isWu() {
        testboo = this.input % 3 == 0;
        return testboo;
    }

    public Boolean isTang() {
        testboo = this.input % 5 == 0;
        return testboo;
    }

    public Boolean isWuTang() {
        testboo = this.input % 3 == 0 && input % 5 == 0;
        return testboo;
    }
}
