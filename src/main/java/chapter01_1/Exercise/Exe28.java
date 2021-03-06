package chapter01_1.Exercise;

import chapter01_1.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        int[] whitelist = {7, 1, 5, 1, 9, 5, 7, 7, 5, 1};
        Arrays.sort(whitelist);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < whitelist.length - 1; i++) {
            if (whitelist[i] != whitelist[i + 1]) {
                list.add(whitelist[i]);
            }
        }
        list.add(whitelist[whitelist.length - 1]);
        whitelist = new int[list.size()];

        for (int i = 0; i < whitelist.length; i++) {
            whitelist[i] = list.get(i);
            System.out.print(whitelist[i] + " ");
        }
        System.out.println();
        System.out.println(BinarySearch.rank(new Scanner(System.in).nextInt(), whitelist));
    }
}
