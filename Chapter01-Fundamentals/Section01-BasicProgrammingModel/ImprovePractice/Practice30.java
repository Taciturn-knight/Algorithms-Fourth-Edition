/**
 * Practice30 
 */
public class  Practice30 {
    public static void Practice30(int N) {
        boolean[][] bool = new boolean[N][N];
        for(int i = 1; i<N; i++){
            for(int j = 1; j<N; j++){
                if(Euclid(i, j) == 1){
                    bool[i][j] = true;
                }
            }
        }

        for(int i = 0; i<N; i++){
            StdOut.printf("\n");
            for(int j = 0; j<N; j++){
                StdOut.printf("%b\t", bool[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Practice30(10);
    }

}