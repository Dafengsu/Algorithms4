package chapter01_02;

import edu.princeton.cs.algs4.Accumulator;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author su
 * @description
 * @date 2020/4/13
 */
public class VisualAccumulator {
    private int N;
    private double total;
    public VisualAccumulator(int trials, double max)
    {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }
    public void addDataValue(double val)
    {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total/N);
    }

    public static void main(String[] args) {
        VisualAccumulator a = new VisualAccumulator(100, 1.0);
        for (int t = 0; t < 100; t++)
            a.addDataValue(StdRandom.random());
        StdOut.println(a);
    }
}
