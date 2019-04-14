/**
 * 编译: javac Point2DCase.java
 * 执行: java Point2DCase {@var Integer}
 * 依赖: Point2D.java StdRandom.java StdOut.java
 *
 * % java Point2DCase 10
 * minDist: 0.053946
 */
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

/**
 * Practice 1.2.1
 * {@code Point2DCase}, 编写一个Point2D的用例，从命令行接受一个整数N。在单位正方形
 * 中生成N个随机点，然后计算两点之间的距离。
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