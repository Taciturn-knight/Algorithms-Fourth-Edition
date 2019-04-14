import edu.princeton.cs.algs4.*;

/**
 * Log2
 */
public class Practice20 {
	public static double log2(long num) {
		if(num == 1) return 0;
		else return Math.log(num) + log2(num-1);
	}

    public static void main(String[] args) {
		long num = StdIn.readLong();
		StdOut.println(log2(num));
    }
}