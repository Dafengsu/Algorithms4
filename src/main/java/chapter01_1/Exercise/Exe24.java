package chapter01_1.Exercise;

public class Exe24 {
    public static int euclid(int p, int q) {
//        System.out.println("p=" + p + ",q=" + q);
        //0没有约数所以返回最小约数1
        if (p == 0 || q == 0) {
            return 1;
        }
        //如果p < q,交换p , q
        if (p < q) {
            int t = p;
            p = q;
            q = t;
        }
        //如果p % q == 0 q就是p的约数
        if (p % q == 0) {
            return q;
        } else {
            return euclid(q, p % q);
        }
    }

    public static void main(String[] args) {
        System.out.println("result:" + euclid(105, 24));
        System.out.println("result:" + euclid(1111111, 1234567));
    }
}
