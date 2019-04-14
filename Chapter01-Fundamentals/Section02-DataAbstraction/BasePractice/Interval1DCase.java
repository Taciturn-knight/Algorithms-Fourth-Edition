/**
 * ����: javac Interval1DCase.java
 * ִ��: java Interval1DCase {@var integer} < Interval1D.txt
 * ����: Interval1D.java StdOut.java
 * 
 * % java Interval1DCase 3 < Interval1D.txt
 * [0.1, 1.0]
 * [-0.1, 0.5]
 * [1.5, 2.0]
 * intersect: [0.1, 1.0], [-0.1, 0.5]
 */
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

/**
 * Practice 1.2.2
 * {@code Interval1DCase} ��дһ��Interval1D���������������н���һ������N���ӱ�׼�����ж�
 * ȡN�����(ÿ�������һ��doubleֵ����)����ӡ�������ཻ�ļ���ԡ�
 */
public class Interval1DCase {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Interval1D[] vals = new Interval1D[N];

        int count = 0;
        while(!StdIn.isEmpty()){
            double min = StdIn.readDouble();
            double max = StdIn.readDouble();
            if(min > max){
                double tmp = 0;
                tmp = min;
                min = max;
                max = tmp;
            }
            vals[count] = new Interval1D(min, max);
            StdOut.println(vals[count]);
            count++;
            if(N == count) break;
        }
        for(int i = 0; i < count; i++){
            for(int j = i+1; j < count; j++){
                if(vals[i].intersects(vals[j])){
                    StdOut.printf("intersect: %s, %s\n", vals[i], vals[j]);
                }
            }
        }
    }
}