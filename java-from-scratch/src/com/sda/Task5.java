package com.sda;

import java.util.ArrayList;

public class Task5 {
   /* public static Integer array_max(Integer data[], int n) {
         int max = data[0];
         for (int i = 1; i < data.length - 1; i++) {
            if (data[i] > max) {
                max = data[i];
            }
         }
         return max;
    }*/
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }


    /*

    copied from main

    ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(0);
        integerArrayList.add(20);
        integerArrayList.add(4);
        integerArrayList.add(0);
        integerArrayList.add(0);
        integerArrayList.add(9);

    ArrayList<Integer> newArrayList = new ArrayList<>();

    int newArrayList_index = 0;

        for (int i = 0; i < integerArrayList.size(); i++) {
        if (integerArrayList.get(i) == 0) {
            newArrayList.add(newArrayList_index++, integerArrayList.get(i));
        }
    }

        for (int i = 0; i < integerArrayList.size(); i++) {
        if (integerArrayList.get(i) != 0) {
            newArrayList.add(newArrayList_index++, integerArrayList.get(i));
        }
    }

        for (int j=0; j < newArrayList.size(); j++) {
        integerArrayList.set(j, newArrayList.get(j));
    }

        System.out.println(newArrayList);*/










}
