/**
 * Binomial
 */
public class Binomial {

    public static double binomial(int N, int k ,double p) {
        if(N == 0 && k == 0) return 1.0;
        if(N < 0 || k < 0) return 0.0;
        return (1.0-p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
    }


    /**
     * Retruns the factorial value of an no negative int value. If num is negative value it will throw a RuntimeException.
     * @param num the argument whose factorial value is to be determined
     * @return the factorial value of num.
     * @throw RuntimeException: Negative number don`t have factorial.
     */
    private static long factorial(int num) {
        int fac = 1;
        if(num < 0) throw new RuntimeException("Negative number don`t have factorial.");
        else if(num == 0) return fac;
        else{
            for(int i = 1; i<=num; i++)
                fac *= i;
        }
        return fac;
    }
    
    /**
     * Returns the combinatorial value of m and n.
     * @param m is sample size.
     * @param n is specimen.
     * @return C(m,n) value.
     * @throw RuntimeException: The value of m is less than n.
     */
    private static long combinatorial(int m,int n) {
        if(n>m) throw new RuntimeException("The value of m is less than n.");
        return factorial(m) / (factorial(n) * factorial(m-n));
    }

    /**
     * 随机变量X服从参数为N,p的二项分布。计算P{X = k}的值。P{X = k} = C(N,k)*p^k*(1-p)^(n-k)
     * @param N 样本总量
     * @param k 抽样数
     * @param p 事件发生概率
     * @return P{X = k}
     */
    public static double binomial1(int N, int k, double p){
        if(k>N) throw new RuntimeException("The value of N is less than k");
        if(p>1.0) throw new RuntimeException("The value of p is greater than 1.0");
        return combinatorial(N,k) * Math.pow(p, k) * Math.pow(1-p, (N-k));
    }    

    public static void main(String[] args) {
        int N = StdIn.readInt();
        int k = StdIn.readInt();
        double p = StdIn.readDouble();
        StdOut.println(binomial1(N, k, p));
    }
}
