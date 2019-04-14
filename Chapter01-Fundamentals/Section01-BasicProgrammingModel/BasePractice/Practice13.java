import edu.princeton.cs.algs4.StdOut;
/**
 * Transpose
 */
public class Practice13 {
    public static void main(String[] args) {
		int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
		int temp = 0;
		for(int i=0; i<3; i++){
			for(int j=i; j<3; j++){
				temp = num[i][j];
				num[i][j] = num[j][i];
				num[j][i] = temp;
			}
		}

		for(int i = 0; i<3; i++){
			System.out.println();
			for(int j = 0; j<3; j++){
				StdOut.printf("%d\t",num[i][j]);
			}
		}
    }
}