package chapter01_1.Exercise;

import java.util.Arrays;

public class Exe27 {
    private static long COUNT = 0;
    private static long COUNT2 = 0;
    //创建矩阵数组记录计算值，减少递归次数（空间换时间）
    private static double[][] MATRIX;
    public static void main(String[] args) {
//        System.out.println("result: " + binomial(30, 10, 0.25) + " COUNT: " + COUNT);
        System.out.println("result: " + betterBinomial(100, 50, 0.25) + " COUNT2: " + COUNT2);
    }

    public static double binomial(int N, int k, double p) {
        COUNT++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    private static double bin(int N, int k, double p) {
        COUNT2++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }

        if (MATRIX[N][k] == -1) {
            MATRIX[N][k] = (1.0 - p) * bin(N - 1, k, p) + p * bin(N - 1, k - 1, p);
        }
        return MATRIX[N][k];
    }

    private static double betterBinomial(int N, int k, double p) {
        MATRIX = new double[N + 1][k + 1];
        for (int i = 0; i <= N; i++) Arrays.fill(MATRIX[i], -1);
        return bin(N, k, p);
    }
}
