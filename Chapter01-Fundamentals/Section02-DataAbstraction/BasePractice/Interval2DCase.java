/**
 * ����: javac Interval2DCase.java
 * ִ��: java Interval2DCase Interval2D.num Draw.min Draw.max 
 * ����: StdRandom.java Interval1D.java Interval2D.java StdDraw.java StdOut.java
 * 
 * % java Interval2DCase 3 0 4
 * intersect num: 3
 */
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

/**
 * Practice 1.2.3
 * {@code Interval2DCase} ��дһ��Interval2D���������������н��ܲ���N��min��max������N��
 * �����2D��������͸߾��ȷֲ��ڵ�λ�������е�min��max֮�䡣��StdDraw�������ǲ���ӡ���ཻ
 * �ļ����������
 */
public class Interval2DCase {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        StdDraw.setPenRadius(.001);
        StdDraw.setPenColor(StdDraw.BLACK);

        Interval2D[] vals = new Interval2D[N];
        for(int i = 0; i < N; i++){
            double xMin = StdRandom.uniform(min, max);
            double xMax = StdRandom.uniform(xMin, max);
            double yMin = xMax;
            double yMax = StdRandom.uniform(yMin, max);
            Interval1D a = new Interval1D(xMin, xMax);
            Interval1D b = new Interval1D(yMin, yMax);
            vals[i] = new Interval2D(a, b);
            vals[i].draw();
        }

        int intersectNum = 0;
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                if(vals[i].intersects(vals[j])) intersectNum++;
            }
        }

        StdOut.printf("intersect num: %d", intersectNum);
    }    
}