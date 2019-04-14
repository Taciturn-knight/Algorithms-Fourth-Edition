import edu.princeton.cs.algs4.*;
import java.util.Arrays;

// from 1.1.6.4 递归
//java BinarySearch largeW.txt < largeT.txt
/**
 * RecursionBinarySearch
 */
public class RecursionBinarySearch {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int low, int high) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (key < a[mid])
            return rank(key, a, low, mid - 1);
        else if (key > a[mid])
            return rank(key, a, mid + 1, high);
        else
            return mid;
    }

    public static void main(String[] args) {
        In inputFile = new In(args[0]);
        int[] whitelist = inputFile.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if(rank(key, whitelist) == -1){
                StdOut.println(key);
            }
        }
    }

}