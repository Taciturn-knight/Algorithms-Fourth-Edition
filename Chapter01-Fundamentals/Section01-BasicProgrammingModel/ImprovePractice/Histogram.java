/**
 * Histogram 
 */
public class Histogram {

    public static void histogram(int N, double l, double r) {
        int num = 5000;
        double space = (r - l) / N;
        int[] hist = new int[N];
        double[] list = new double[num];
        for(int i = 0; i<num; i++){
            list[i] = StdRandom.uniform(l,r);
            StdOut.println(list[i]);
        }
        
        for(int i = 0; i<num; i++){
            if(list[i]<l || list[i]>r) continue;
            double n = list[i] - l;
            int index = (int)Math.ceil(n/space) - 1;
            StdOut.println(index);
            hist[index]++;
        }

        for(int i = 0; i<N; i++){
            double x = 1.0 * i/N;
            double y = hist[i]/(2.0*N);
            double halfWidth = 0.5/N;
            double halfHeight = hist[i]/(2.0*N);
            StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
        }
        
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        double l = StdIn.readDouble();
        double r = StdIn.readDouble();
        histogram(N, l, r);
    }
}