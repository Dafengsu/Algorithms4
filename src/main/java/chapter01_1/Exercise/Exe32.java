package chapter01_1.Exercise;

import edu.princeton.cs.algs4.StdDraw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exe32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        /*while (scanner.hasNext()) {
            list.add(scanner.nextDouble());
        }*/
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextDouble());
        }
        int N = 100;
        double l = 0.2, r = 0.6;
        int[] num = new int[N];
        int max = 0;
        double step = (r - l) / N;
        for (double element : list) {
            if (element >= l && element <= r) {
                for (int j = 0; j < N; j++) {
                    if (element > l + step * j && element <= l + step * j + step) {
                        num[j]++;
                        if (max < num[j]) {
                            max = num[j];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            double x = (1.0 * i + 0.5) / N;
            double y = num[i] / (max * 2.0);
            double rw = 0.4 / N;
            StdDraw.filledRectangle(x, y, rw, y);
        }

    }
}
