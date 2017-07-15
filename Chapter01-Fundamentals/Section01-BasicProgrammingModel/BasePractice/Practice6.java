import edu.princeton.cs.algs4.*;
/**
 * Fibonacci
 */
public class Practice6{
    public static void main(String[] args) {
		int f = 0;
        int g = 1;
        for(int i=0; i <= 15; i++){
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}