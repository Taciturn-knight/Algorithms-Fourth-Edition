/**
 * UseArray use GBK character encoding.
 */
public class UseArray {
    public static void main(String[] args) {
        double[] a = {1,2,3,4,5,6,4,3,3,4,55,67,3,4,9,64,3,43,5};
        //�ҳ�����������Ԫ��
        double max = a[0];
        for(int i = 1; i < a.length; i++)
            if (a[i] > max) max = a[i];
        
        //��������Ԫ�ص�ƽ��ֵ
        int N = a.length;
        double sum = 0.0;
        for(int i = 0; i < N; i++){
            sum += a[i];
        }
        double average = sum / N;

        //��������
        double[] b = new double[N];
        for(int i = 0; i < N; i++)
            b[i] = a[i];

        //�ߵ�����Ԫ�ص�˳��
        for(int i = 0; i < N/2; i++){
            double temp = a[i];
            a[i] = a[N-1-i];
            a[N-i-1] = temp;
        }

        //�������
        double[][] a1 = new double[N][N];
        double[][] b1 = new double[N][N];
        double[][] c = new double[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                for(int k = 0; k < N; k++){
                    c[i][j] += a1[i][k] * b1[k][i];
                }
            }
        }
    }
}