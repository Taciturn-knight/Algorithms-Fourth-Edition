import edu.princeton.cs.algs4.StdOut;

/**
 * Matrix
 */
public class Matrix {

    private double[][] matrix;
    public Matrix () {
        matrix = new double[0][0];
    }

    /**
     * 初始化内容为0的n阶Matrix。
     * @param n 阶数
     */
    public Matrix(int n){
        matrix = new double[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = 0;
            }
        }
    }
    
    /**
     * 使用二维数组m 构建Matrix对象
     * @throws CloneNotSupportedException
     */
    public Matrix(double[][] m){
        matrix = m.clone();
        
    }

    /**
     * 显示矩阵
     * @throws ArrayIndexOutOfBoundsException
     */
    public void display() {
        for(int i = 0; i<matrix.length; i++){
            StdOut.println();
            for(int j = 0; j<matrix[0].length; j++){
                StdOut.printf("%f\t",matrix[i][j]);
            }
        }
    }

    /**
     * 向量点乘 dot = x(n) * y(n)
     * @param x 向量
     * @param y 向量
     * @return dot
     * @throws RuntimeException: x向量和y向量的长度必须相同
     * @throws ArrayIndexOutOfBoundsException
     */
    public static double dot(double[] x, double[] y) {
        if(x.length != y.length) throw new RuntimeException("x向量和y向量的长度必须相同");
        double sum = 0;
        for(int i = 0; i<x.length; i++){
            sum += x[i] * y[i];
        }
        return sum;
    }

    /**
     * 矩阵之积，a(i,j) x b(j,k) = mul(i,k)。
     * @param a 矩阵
     * @param b 矩阵
     * @return mul 矩阵
     * @throws RuntimeException: a矩阵的行必须等于b矩阵的列
     * @throws ArrayIndexOutOfBoundsException
     */
    public static double[][] mult(double[][] a,double[][] b) {
        int aline = a.length;
        int alist = a[0].length;
        int bline = b.length;
        int blist = b[0].length;
        if(alist != bline) throw new RuntimeException("a矩阵的行必须等于b矩阵的列");
        double[][] mul = new double[aline][blist];
        for(int i = 0; i<aline; i++){
            for(int j = 0; j<blist; j++){
                for(int k = 0; k<alist; k++){
                    mul[i][j] += a[i][k] * b[k][j]; 
                }
            }
        }
        return mul;
    }

    /**
     * 转置矩阵 A(n,m) = transpose(a(m,n))
     * @param a 矩阵
     * @return trans 矩阵
     * @throws ArrayIndexOutOfBoundsException
     */
    public static double[][] transpose(double[][] a) {
        int aline = a.length;
        int alist = a[0].length;
        double[][] trans = new double[alist][aline]; 
        for(int i = 0; i<aline; i++){
            for(int j = 0; j<alist; j++){
                trans[j][i] = a[i][j];
            }
        }
        return trans;
    }


    /**
     * 矩阵和向量之积，a(m,n) x X(n) = mult(m)
     * @param a 矩阵
     * @param x 向量
     * @return mul 向量
     * @throws RuntimeException: a矩阵的列必须和x的长度相同
     * @throws ArrayIndexOutOfBoundsException
     */
    public static double[] mult(double[][] a,double[] x) {
        int aline = a.length;
        int alist = a[0].length;
        int xsize = x.length;
        if(alist != xsize) throw new RuntimeException("a矩阵的列必须和x的长度相同");
        double[] mul = new double[aline];
        for(int i = 0; i<aline; i++){
            for(int j = 0; j<alist; j++){
                mul[i] += a[i][j] * x[j];
            }
        }
        return mul;
    }


    /**
     * 向量和矩阵之积，y(n) x a(n,m) = mult(m)
     * @param y 向量
     * @param a 矩阵
     * @return 向量
     * @throws RuntimeException: a矩阵的行必须和x的长度相同
     * @throws ArrayIndexOutOfBoundsException
     */
    public static double[] mult(double[] y,double[][]a) {
        int aline = a.length;
        int alist = a[0].length;
        int ysize = y.length;
        if(aline != ysize) throw new RuntimeException("a矩阵的行必须和y的长度相同");
        double[] mul = new double[aline];
        for(int i = 0; i<alist; i++){
            for(int j = 0; j<aline; j++){
                mul[i] += y[j] * a[j][i];
            }
        }
        return mul;
    }

    public static void main(String[] args) {
        double[][] a = {{1,2},{2,3}};
        double[][] b = {{2,3,4},{3,4,5}};
        double[][] c = {{1,2},{2,3},{3,4}};
        double[] one = {1,2,3};
        double[] two = {1,2,3};

        StdOut.println(dot(one, two));
        Matrix m = new Matrix(mult(a, b));
        m.display();
        StdOut.println();

        Matrix m1 = new Matrix(transpose(b));
        m1.display();
        StdOut.println();
        StdOut.println();

        double[] three = mult(b, one);
        for(int i = 0; i<2; i++){
            StdOut.printf("%f\t", three[i]);
        }
        StdOut.println();

        double[] four = mult(one, c);
        for(int i = 0; i<2; i++){
            StdOut.printf("%f\t", four[i]);
        }
        StdOut.println();
    }

}