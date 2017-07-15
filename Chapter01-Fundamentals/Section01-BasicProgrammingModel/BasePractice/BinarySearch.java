import java.util.Arrays;

import edu.princeton.cs.algs4.*;

/**
 * BinarySearch
 */
public class BinarySearch {
	public static int rank(int key, int depth, int[] a) {
		depth++;
		StdOut.printf("depth:%d\n",depth);
		int index = 0;
		int low = 0;
		int high = a.length - 1;
		int mid = low + (high - low)/2;
		if(a[low] == key) return low;
		if(a[mid] == key) return mid;
		if(a[high] == key) return high;
		if(low>high) return -1;
		if(key < a[mid]){
			index = low + rank(key, depth, Arrays.copyOfRange(a, low, mid));
		}else if(key > a[mid]){
			index = mid + rank(key, depth, Arrays.copyOfRange(a, mid, high ));
		}
		return index;
	}
    public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int key = StdIn.readInt();
		Arrays.sort(a);
		StdOut.println(rank(key, 0, a));
    }
}