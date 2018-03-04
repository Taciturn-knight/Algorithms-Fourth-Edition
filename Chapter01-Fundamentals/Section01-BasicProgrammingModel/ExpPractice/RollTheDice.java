import edu.princeton.cs.algs4.*;

public class RollTheDice
{
    public static void main(String[] args)
    {
        int SIDES = 6;
        double[] dist = new double[2*SIDES + 1];
        for(int i = 1; i <= SIDES; i++)
            for(int j = 1; j <= SIDES; j++)
                dist[i + j] += 1.0;

        for(int k = 2; k <= 2 * SIDES; k++)
            dist[k] /= 36.0;

        for(int i = 2; i < dist.length; i++)
            StdOut.printf("dist sum: %d p: %.4f\n", i, dist[i]);

        int m1, m2;
        double[] hist = new double[2*SIDES + 1];
        double[] sum = new double[2*SIDES + 1];
        boolean[] flag = new boolean[2*SIDES + 1];
        int count = 0;
        int flagCount = 0;
        do
        {
            flagCount = 0;
            m1 = StdRandom.uniform(1, 7);
            m2 = StdRandom.uniform(1, 7);
            sum[m1 + m2] += 1.0;
            count++;
            for(int p =2; p < 2 * SIDES + 1; p++)
            {
                hist[p] = sum[p] / count;
                flag[p] = (Math.floor(hist[p] * 1000) == Math.floor(dist[p] * 1000));
            }
            for(int i = 0; i < 2* SIDES + 1; i++)
            {
                if(flag[i])
                    flagCount++;
            }
        }while(flagCount != 11);
        for(int i = 2; i < hist.length; i++)
            StdOut.printf("hist sum: %d p: %.4f\n", i, hist[i]);
        StdOut.printf("count: %d", count);
    }
}
