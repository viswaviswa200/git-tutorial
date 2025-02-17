package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void PrintFib(int n){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        for(int i=1;i<n;i++) arr.add(arr.get(i) + arr.get(i-1));
        for(int i=0;i<n;i++) System.out.println(arr.get(i));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintFib(in.nextInt());
    }
}
