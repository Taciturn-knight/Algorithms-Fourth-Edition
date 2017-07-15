import edu.princeton.cs.algs4.*;

/**
 * Fibonacci
 */
public class Fibonacci {
	public static long Fibonacci(int N) {
		if(N == 0) return 0;
		if(N == 1) return 1;
		return Fibonacci(N-1) + Fibonacci(N-2);
	}

    public static void main(String[] args) {
		for(int N = 0; N<100; N++)
			StdOut.println(N + " " + Fibonacci(N));
    }
}