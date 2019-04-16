import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * QuickFind
 */
public class QuickFind {

    private int[] id;
    private int count;

    public QuickFind(int num) {
        count = num;
        id = new int[num];
        for (int i = 0; i < num; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        return id[p];
    }

    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);

        if (pId == qId)
            return ;

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId)
                id[i] = qId;
        }
        count--;
    }

    public static void main(String[] args) {
        Stopwatch timer = new Stopwatch();
        int num = StdIn.readInt();
        QuickFind uf = new QuickFind(num);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q))
                continue;

            uf.union(p, q);
        }
        StdOut.println("time: " + timer.elapsedTime());
        StdOut.println("components: " + uf.count());
    }
}