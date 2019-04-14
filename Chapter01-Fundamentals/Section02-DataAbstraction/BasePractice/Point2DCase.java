/**
 * ����: javac Point2DCase.java
 * ִ��: java Point2DCase {@var Integer}
 * ����: Point2D.java StdRandom.java StdOut.java
 *
 * % java Point2DCase 10
 * minDist: 0.053946
 */
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

/**
 * Practice 1.2.1
 * {@code Point2DCase}, ��дһ��Point2D���������������н���һ������N���ڵ�λ������
 * ������N������㣬Ȼ���������֮��ľ��롣
 */
public class Point2DCase {

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);

        Point2D[] points = new Point2D[count];
        for(int i = 0; i < count; i++){
            double x = StdRandom.uniform();
            double y = StdRandom.uniform(); 
            points[i] = new Point2D(x, y);
        }

        double minDist = Double.MAX_VALUE;
        for(int i = 0; i < count; i++){
            for(int j = i+1; j < count; j++){
                double temp = points[i].distanceTo(points[j]);
                if(minDist > temp){
                    minDist = temp;
                }
            }
        }

        StdOut.printf("minDist: %f", minDist);
    }    
}