/**
 * ����: javac BinarySearch.java
 * ִ��: java BinarySearch witelist.txt < search.txt
 * ����: StdIn.java StdOut.java In.java Counter.java
 * 
 * % java BinarySearch tinyW.txt < tinyT.txt
 * Search value/times: 50/4
 * Search value/times: 99/4
 * Search value/times: 13/4
 * 
 */
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Counter;
import java.util.Arrays;

/**
 * Pracetice 1.2.9
 * {@code BinarySearch} �޸�BinarySearch��ʹ��Counterͳ���ڲ����б����ļ����������ڲ�
 * ��ȫ���������ӡ��ֵ��
 */
public class BinarySearch{
    public static int rank(int key, int[] a, Counter count){
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi){
            count.increment();
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
        In whiteIn = new In(args[0]);
        int[] whitelist = whiteIn.readAllInts();
        Arrays.sort(whitelist);
        while(!StdIn.isEmpty()){
            Counter count = new Counter("BinarySearch");
            int key = StdIn.readInt();
            if(rank(key, whitelist, count) != -1){
                StdOut.printf("Search value/times: %d/%d\n", key, count.tally());
            }
        }

    }
}