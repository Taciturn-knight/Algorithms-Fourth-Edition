import edu.princeton.cs.algs4.*;

/**
 * Euclid
 */
public class Euclid {
	public static int euclid(int divisor, int dividend) {
		StdOut.printf("divisor: %d\tdividend: %d\n", divisor,dividend);
		int remainder = divisor%dividend;
		if(remainder == 0){
			return dividend;
		}
		return euclid(dividend, remainder);
	}
	public static void main(String[] args) {
		int divisor = Integer.parseInt(args[0]);
		int dividend = Integer.parseInt(args[1]);
		StdOut.println(euclid(divisor, dividend));
    }
}