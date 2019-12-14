package chapter01_1.Exercise;

import java.util.Scanner;

import static chapter01_1.Exercise.Exe24.euclid;

public class Exe30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = euclid(i, j) == 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
