import edu.princeton.cs.algs4.*;

/**
 * Logarithm
 */
public class Practice14 {
	public static int lg(int num)
	{
		int j = 0, i = 1;
		while(true)
		{
			i = 2 * i;
			if(i > num) break;
			j++;
		}
		return j;
	}
	public static void main(String[] args) {
		StdOut.printf("Please input a int type num:");
		int N = StdIn.readInt();
		StdOut.println(lg(N));
	}
}