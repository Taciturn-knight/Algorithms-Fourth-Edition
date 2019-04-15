import java.util.Arrays;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * TwoSumFast
 */
public class TwoSumFast {

    public static int count(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
            if(BinarySearch.indexOf(a, -a[i]) > i)
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        In inputfile = new In(args[0]);
        int[] a = inputfile.readAllInts();
        StdOut.println(count(a));
    }
}