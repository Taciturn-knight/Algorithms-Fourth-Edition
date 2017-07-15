import edu.princeton.cs.algs4.*;
/**
 * Practice5
 */
public class Practice5 {
    public static void main(String[] args) {
        String readNum = StdIn.readString();
        BigDecimal num = new BigDecimal(readNum);
        BigDecimal zero = new BigDecimal(0);
        BigDecimal one = new BigDecimal(1);
        // num > 0 && num < 1
        if ((num.compareTo(zero) == 1)&&(num.compareTo(one) == -1)) {
            StdOut.printf("true");
        } else {
            StdOut.printf("false");
        }
    }
}