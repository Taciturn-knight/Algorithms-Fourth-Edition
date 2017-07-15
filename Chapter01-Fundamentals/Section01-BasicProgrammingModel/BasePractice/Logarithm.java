import edu.princeton.cs.algs4.*;

/**
 * Logarithm
 */
public class Logarithm {
	public static void main(String[] args) {
		StdOut.printf("Please input a int type num:");
		int N = StdIn.readInt();
		int j = 0, i = 1;
		while (true) {
			i = 2 * i;
			if (i > N)
				break;
			j++;
		}
		StdOut.println(j);
	}
}