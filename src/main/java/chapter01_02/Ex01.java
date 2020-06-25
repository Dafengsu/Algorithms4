package chapter01_02;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;

/**
 * @author su
 * @description
 * @date 2020/4/13
 */
public class Ex01 {
    public static void main(String[] args) {
        int N = 10000;
        Point2D[] points = new Point2D[N];
        StdDraw.setPenColor(StdDraw.RED);
        for (int i = 0; i < N; i++) {
            points[i] = new Point2D(Math.random(), Math.random());
            points[i].draw();
        }

        if (N > 1) {
            double min = points[0].distanceTo(points[1]);
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (points[i].distanceTo(points[j]) < min) {
                        min = points[i].distanceTo(points[j]);
                    }
                }
            }
            System.out.println("Min distance: " + min);
        }
    }
}
