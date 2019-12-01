package chapter01;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.*;
import java.nio.file.Paths;
import java.util.Arrays;
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
                return a[mid];
            }else if(a[mid] < key){
                high = mid -1;
            }else{
                low = mid +1;
            }

        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        //DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("chapter01/tinyW.txt")));

        int[] whiteList = In.readInts("chapter01/tinyW.txt");
        Arrays.sort(whiteList);
        Scanner scanner = new Scanner(Paths.get("chapter01/tinyT.txt"), "UTF-8");
        while (scanner.hasNext()) {
           /* int key = StdIn.readInt();*/
            int key = scanner.nextInt();
            if (rank(key, whiteList) < 0) {
//                StdOut.println(key);
                System.out.println(key);
            }
        }
    }
}
