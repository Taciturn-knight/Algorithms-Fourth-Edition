import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * QuickFind
 */
public class WeightedQuickUnion {

    private int[] id;
    private int[] sz;
    private int count;

    public WeightedQuickUnion(int num) {
        count = num;
        id = new int[num];
        sz = new int[num];
        for (int i = 0; i < num; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);

        if (pId == qId)
            return ;

        if(sz[pId] < sz[qId])
        {
            id[pId] = qId;
            sz[qId] += sz[pId];
        }
        else
        {
            id[qId] = pId;
            sz[pId] += sz[qId];
        }
        count--;
    }

    public static void main(String[] args) {
        Stopwatch timer = new Stopwatch();
        int num = StdIn.readInt();
        WeightedQuickUnion uf = new WeightedQuickUnion(num);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q))
                continue;

            uf.union(p, q);
            // StdOut.println(p + " " + q);
        }
        StdOut.println("time: " + timer.elapsedTime());
        StdOut.println("components: " + uf.count());
    }
}