package com.sda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {




        /*ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(0);
        integerArrayList.add(20);
        integerArrayList.add(4);
        integerArrayList.add(0);
        integerArrayList.add(20);
        integerArrayList.add(9);
        integerArrayList.add(5);

        System.out.println(integerArrayList);
        Main.removeDuplicates(integerArrayList);
        System.out.println(integerArrayList);*/


        /*ArrayList<Integer> newArrayList = new ArrayList<>();

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

    public static void removeDuplicates(ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = i + 1; j < arrList.size(); j++) {
                if (arrList.get(i).equals(arrList.get(j))) {
                    arrList.remove(j);
                    j--;
                }
            }
        }



    }




}




//generic and generic classes, array lists
