package chapter01_1.Exercise;

import chapter01_1.BinarySearch;

import java.util.Arrays;

public class Exe29 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Arrays.fill(array, 1);
        int rank = BinarySearch.rank(1, array);
        System.out.println(BinarySearch.count(1,array));
    }
}
