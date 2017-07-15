import edu.princeton.cs.algs4.*;

/**
 * BooleanArray
 */
public class BooleanArray {
    public static void main(String[] args) {
		boolean[][] bool = {{true,false,true},{false,false,true},{true,false,false}};

        StdOut.printf("  0  1  2");
        for(int i = 0; i<3; i++){
            StdOut.printf("\n");
            StdOut.print(i);
            for(int j = 0; j<3; j++){
                if(bool[i][j] == true){
                    StdOut.printf(" * ");
                }else{
                    StdOut.printf("   ");
                }
            }
        }
    }
}