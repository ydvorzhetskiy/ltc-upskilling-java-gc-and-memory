package edu.java;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{

        for (int i = 0; i < 1_000_000; ++i) {
            List<Integer> list = new LinkedList<>();
            Thread.sleep(1000);
            for (int j = 0; j < 1_000_000; ++j) {
                list.add(j);
            }
        }
    }
}
