import edu.princeton.cs.algs4.*;

/**
 * ExR1
 */
public class ExR1 {
	public static String exR1(int n) {
		if(n <= 0) return "*";
		return exR1(n-3) + n + exR1(n-2) + n;
	}

    public static void main(String[] args) {
		String str = exR1(6);
		System.out.println(str);
    }

}