package com.alireza;
import java.lang.Math;
import java.util.Arrays;

public class WealthDistribution {
    public static void main(String[] args) {

        int[] people = new int[1000];
        for (int i = 0; i < 1000; i++) {
            people[i] = 100;
        }
        for (int i = 0; i < 1200; i++) {
            for (int j = 0; j < 1000; j++) {
                if (people[j] > 1) {
                    int rand = (int) (Math.random() * 1000);
                    people[j]--;
                    people[rand]++;
                }
            }
        }
        int max = people[0], min = people[0];
        for (int i = 0; i < 1000; i++) {
            if (people[i] > max) max = people[i];
            if (people[i] < min) min = people[i];
        }
        System.out.println(Arrays.toString(people));
        System.out.println("The richest person have " + max + "$");
        System.out.println("The poorest person have " + min + "$");
        if (max - min <= 50) System.out.println("we have justice in this country");
        else System.out.println("Justice in this country ? No No No !!");
    }
}
