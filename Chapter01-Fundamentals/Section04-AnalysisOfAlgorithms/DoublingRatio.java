import edu.princeton.cs.algs4.DoublingTest;
import edu.princeton.cs.algs4.StdOut;

/**
 * DoublingRatio
 */
public class DoublingRatio {

    public static void main(String[] args) {
        double prev = DoublingTest.timeTrial(125);
        for (int i = 250; true; i += i) {
            double time = DoublingTest.timeTrial(i);
            StdOut.printf("%6d %7.1f %5.1f\n", i, time, time/prev);
            prev = time;
        }
    }
}