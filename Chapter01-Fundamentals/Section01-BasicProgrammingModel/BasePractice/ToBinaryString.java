import edu.princeton.cs.algs4.*;

/**
 * ToBinaryString
 */
public class ToBinaryString {
    public static void main(String[] args) {
		StdOut.printf("Please input a int Type num:");
        int num = StdIn.readInt();
        String s = "";
        for(int i = num; i > 0; i /= 2){
            s = (i % 2) + s;
        }
        StdOut.print(s);
    }
}