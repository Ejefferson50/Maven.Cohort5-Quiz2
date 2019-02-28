package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class Router {
    private String path;
    private String controller;
    private TreeMap<String, String> treemap;

    public Router() {

        this.treemap = new TreeMap<>();
    }


    public void add(String path, String controller) {
        treemap.put(path, controller);
    }

    public Integer size() {
        return treemap.size();

    }

    public String getController(String path) {

        for (Map.Entry<String, String> key : treemap.entrySet()) {
            if (key.getValue().equals(path)) {
                return key.getValue();
            }
        }
        return treemap.get(path);
    }

    public void update(String path, String studentController) {

        remove(path);
        add(path, studentController);
    }

    public void remove(String path) {
        treemap.remove(path);
    }


    public String toString() {
        String result = "";
        for (Map.Entry<String, String> key : treemap.entrySet()) {
            result += key.getKey() + " -> " + key.getValue() + "\n";
        }
        return result;


    }
}