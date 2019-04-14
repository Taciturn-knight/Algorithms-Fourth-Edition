import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import java.util.Arrays;

// from 1.1.1 Java程序的基本结构
//java BinarySearch largeW.txt < largeT.txt

public class BinarySearch{
    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi){
            int mid = lo + (hi -lo) / 2;
            if(key < a[mid]){
                hi = mid - 1;
            }else if(key > a[mid]){
                lo = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        In inputFile = new In(args[0]);
        int[] whitelist = inputFile.readAllInts();
        Arrays.sort(whitelist);
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(key, whitelist) == -1){
                StdOut.println(key);
            }
        }
    }
}