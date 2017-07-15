import java.text.DecimalFormat;

import edu.princeton.cs.algs4.*;

/**
 * Practice21
 */
public class Practice21 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.000");
        String name = "";
        String outPut = "";
        int one = 0;
        int two = 0;
        while(!StdIn.isEmpty())
        {
            name = StdIn.readString();
            outPut += (name + "\t");
            one = StdIn.readInt();
            outPut += (String.valueOf(one) + "\t");
            two = StdIn.readInt();
            outPut += (String.valueOf(two) + "\t");
            double three = (double)one/(double)two;
            outPut += (format.format(three) + "\n");
        }
            StdOut.printf("%s", outPut);
    }
}