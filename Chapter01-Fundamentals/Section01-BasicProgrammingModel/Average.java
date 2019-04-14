import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

// from 1.1.9.4 标准输入
// java Average
// 1.234
// 2.321
// 3.456
// <ctrl-d> or <ctrl-z>
public class Average
{
    public static void main(String[] args) {
        double sum = 0.0;
        int cnt = 0;
        while(!StdIn.isEmpty())
        {
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum / cnt;
        StdOut.printf("Average is %.5f\n", avg);
    }

}