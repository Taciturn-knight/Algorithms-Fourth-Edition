import edu.princeton.cs.algs4.*;
/**
 * Practice3
 */
public class Practice3 {
    public static void main(String[] args) {
        int one = StdIn.readInt();
        int two = StdIn.readInt();
        int three = StdIn.readInt();
        if (one == two && two == three) {
            StdOut.printf("equal");
        } else {
            StdOut.printf("not equal");
        }
    }
}