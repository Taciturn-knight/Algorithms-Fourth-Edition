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
     * ��ʼ������Ϊ0��n��Matrix��
     * @param n ����
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
     * ʹ�ö�ά����m ����Matrix����
     * @throws CloneNotSupportedException
     */
    public Matrix(double[][] m){
        matrix = m.clone();
        
    }

    /**
     * ��ʾ����
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
     * ������� dot = x(n) * y(n)
     * @param x ����
     * @param y ����
     * @return dot
     * @throws RuntimeException: x������y�����ĳ��ȱ�����ͬ
     * @throws ArrayIndexOutOfBoundsException
     */
    public static double dot(double[] x, double[] y) {
        if(x.length != y.length) throw new RuntimeException("x������y�����ĳ��ȱ�����ͬ");
        double sum = 0;
        for(int i = 0; i<x.length; i++){
            sum += x[i] * y[i];
        }
        return sum;
    }

    /**
     * ����֮����a(i,j) x b(j,k) = mul(i,k)��
     * @param a ����
     * @param b ����
     * @return mul ����
     * @throws RuntimeException: a������б������b�������
     * @throws ArrayIndexOutOfBoundsException
     */
    public static double[][] mult(double[][] a,double[][] b) {
        int aline = a.length;
        int alist = a[0].length;
        int bline = b.length;
        int blist = b[0].length;
        if(alist != bline) throw new RuntimeException("a������б������b�������");
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
     * ת�þ��� A(n,m) = transpose(a(m,n))
     * @param a ����
     * @return trans ����
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
     * ���������֮����a(m,n) x X(n) = mult(m)
     * @param a ����
     * @param x ����
     * @return mul ����
     * @throws RuntimeException: a������б����x�ĳ�����ͬ
     * @throws ArrayIndexOutOfBoundsException
     */
    public static double[] mult(double[][] a,double[] x) {
        int aline = a.length;
        int alist = a[0].length;
        int xsize = x.length;
        if(alist != xsize) throw new RuntimeException("a������б����x�ĳ�����ͬ");
        double[] mul = new double[aline];
        for(int i = 0; i<aline; i++){
            for(int j = 0; j<alist; j++){
                mul[i] += a[i][j] * x[j];
            }
        }
        return mul;
    }


    /**
     * �����;���֮����y(n) x a(n,m) = mult(m)
     * @param y ����
     * @param a ����
     * @return ����
     * @throws RuntimeException: a������б����x�ĳ�����ͬ
     * @throws ArrayIndexOutOfBoundsException
     */
    public static double[] mult(double[] y,double[][]a) {
        int aline = a.length;
        int alist = a[0].length;
        int ysize = y.length;
        if(aline != ysize) throw new RuntimeException("a������б����y�ĳ�����ͬ");
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