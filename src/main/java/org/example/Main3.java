package org.example;

import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        int[] a = {6,5,3,1,2,0};
        a = Arrays.stream(a).sorted().toArray();
        Arrays.stream(a).forEach(System.out::println);
    }
}
