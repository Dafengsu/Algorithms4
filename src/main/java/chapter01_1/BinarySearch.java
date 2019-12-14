package chapter01_1;

import edu.princeton.cs.algs4.In;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class BinarySearch{
    public static int rank(int key, int[] a){
        //低位
        int low = 0;
        //高位
        int high = a.length -1;
        //循环条件：low <= high,即两个下标不相遇
        while(low <= high){
            //取mid,以下这种算法可以防止溢出
            int mid = low + (high - low)/2;
            if(a[mid] == key){
                return mid;
            }else if(a[mid] < key){
                low = mid +1;
            }else{
                high = mid -1;
            }

        }
        return -1;
    }
    public static int forcerank(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int count(int key, int[] a) {
        int num = 1;
        int pos = rank(key, a);
        int temp = pos;
        while (temp < a.length - 1 && a[temp] == a[++temp]) {
            num++;
        }
        temp = pos;
        while (temp > 0 && a[temp] == a[--temp]) {
            num++;
        }
        return num;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        //DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("chapter01/tinyW.txt")));

        int[] whiteList = In.readInts("data/tinyW.txt");
        Arrays.sort(whiteList);
        Scanner scanner = new Scanner(Paths.get("data/tinyT.txt"), "UTF-8");
        List<Integer> keyList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            keyList.add(scanner.nextInt());
        }

        long start1 = System.nanoTime();
        for (Integer key : keyList) {
            if (rank(key, whiteList) < 0) {
                System.out.println(key);
            }
        }
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        for (Integer key : keyList) {
            if (forcerank(key, whiteList) < 0) {
                System.out.println(key);
            }
        }
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        for (Integer key : keyList) {
            if (rank(key, whiteList) < 0) {
                System.out.println(key);
            }
        }
        long end3 = System.nanoTime();
        long start4 = System.nanoTime();
        for (Integer key : keyList) {
            if (forcerank(key, whiteList) < 0) {
                System.out.println(key);
            }
        }
        long end4 = System.nanoTime();
        System.out.println("rank time1: " + (end1 - start1) + " forceRank time1: " + (end2 - start2)+
                " rank time2: " + (end3 - start3) + " forceRank time2: " + (end4 - start4));
    }

    public static int indexOf(int[] a, int i) {
        return rank(i, a);
    }
}
