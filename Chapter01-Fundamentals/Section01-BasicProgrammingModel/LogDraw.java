import edu.princeton.cs.algs4.StdDraw;

// from 1.1.9.8 标准绘图库.函数值
// java LogDraw

public class LogDraw{
    public static void main(String[] args) {
        int n = 100;
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n*n);
        StdDraw.setPenRadius(0.01);
        for(int i=1; i<=n; i++)
        {
            StdDraw.point(i, i);
            StdDraw.point(i, i*i);
            StdDraw.point(i, i*Math.log(i));
        }
    }
}