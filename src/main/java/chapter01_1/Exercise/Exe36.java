package chapter01_1.Exercise;

import edu.princeton.cs.algs4.StdRandom;

public class Exe36 {
    public static void main(String[] args) {
        int M = 10;
        int N = 100000;
        int[] a = new int[M];
        int[][] num = new int[M][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[j] = j;
            }
            StdRandom.shuffle(a);
            for (int j = 0; j < M; j++) {
                num[a[j]][j]++;
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
