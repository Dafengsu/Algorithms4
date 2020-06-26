package chapter01_02;

import edu.princeton.cs.algs4.*;

/**
 * @author su
 * @description
 * @date 2020/4/9
 */
public class CalculateArea {
    public static void main(String[] args) {
        calculateArea("0.2", "0.5", "0.5", "0.6", "10000");
    }
    public static void calculateArea(String... args) {
        double xlo = Double.parseDouble(args[0]);
        double xhi = Double.parseDouble(args[1]);
        double ylo = Double.parseDouble(args[2]);
        double yhi = Double.parseDouble(args[3]);
        int T = Integer.parseInt(args[4]);

        Interval1D X = new Interval1D(xlo, xhi);
        Interval1D Y = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(X, Y);
        box.draw();

        Counter counter = new Counter("hits");
        for (int i = 0; i < T; i++) {
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x, y);
            if (box.contains(p)) {
                counter.increment();
            } else {
                p.draw();
            }
        }
        StdOut.println(counter);
        StdOut.println(box.area());
    }
}
