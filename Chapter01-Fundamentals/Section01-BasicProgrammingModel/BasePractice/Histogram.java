import edu.princeton.cs.algs4.*;

/**
 * Histogram
 */
public class Histogram {
    public static int[] histogram(int[] a, int M) {
		int[] hist = new int[M];
		int aSize = a.length;
		for(int i = 0; i<aSize; i++){
			if(a[i]<M){
				hist[a[i]]++;
			}
		}

		for(int i = 0; i<M; i++)
			StdOut.println(hist[i]);
		return hist;	
    }
    public static void main(String[] args) {
		int[] a = {1,2,3,3,4,5,5,6,7,7,8,8,9,1,5,4,3,4,5,6,7,0,4,5,6,2,6};
		StdOut.println(a.length);
		int M = StdIn.readInt();
		int[] h = histogram(a, M);

        StdOut.printf("Show histogram:");
        for(int i = 0; i<h.length; i++){
            StdOut.printf("%d\t",h[i]);
        }
    }
}