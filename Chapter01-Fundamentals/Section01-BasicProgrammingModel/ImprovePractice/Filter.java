import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Filter
 */
public class Filter {

    /**
     * 34-1 ���������С��
     * @param list list[0]�����н�С������list[1]�����нϴ������
     * @param num ���������
     */
    public static void MaxAndMin(double[] list, double num) {
        if(list[0]>num){
            list[0] = num;
        }else if(list[1]<num){
            list[1] = num;
        }
    }

    /**
     * 34-2 ��������������λ��
     * @param list ����������������
     * @return list����λ��
     */
    public static double median(double[] list) {
        int size = list.length;
        int index = size / 2;
        if(size % 2 == 0){
            return (list[index-1] + list[index])/2;
        }
        return list[index];
    }

    /**
     * 34-3 ��kС������kС��100
     */
    public static void main(String[] args) {
        /*
        //34-1
        double one = StdIn.readDouble();
        double two = StdIn.readDouble();
        double[] list = {one,two};
        while (!StdIn.isEmpty()) {
            double num = StdIn.readDouble();
            MaxAndMin(list, num);
        }
        StdOut.println(list[0]);
        StdOut.println(list[1]);

        //34-2
        double[] list = In.readDoubles();
        StdOut.println(median(list));

        //34-3
        double[] list = new double[101];
        for(int i = 0; i<100; i++){
            list[i] = StdIn.readDouble();
        }
        while (!StdIn.isEmpty()) {
            list[100] = StdIn.readDouble();
            Arrays.sort(list);
        }
        int index = 10;
        StdOut.println(index);
        StdOut.println(list[index-1]);

        //34-4
        double sum = 0;
        double num = 0;
        while(!StdIn.isEmpty()){
            num = StdIn.readDouble();
            sum += num * num;
        }
        StdOut.println(sum);

        //34-5
        double sum = 0;
        int count = 1;
        while(!StdIn.isEmpty()){
            sum += StdIn.readDouble();
            count++;
        }
        StdOut.println(sum/count);

        //34-6
        double[] list = In.readDoubles();
        double sum = 0;
        int size = list.length;
        int count = 1;
        for(int i = 0; i<size; i++){
            sum += list[i];
        }
        double average = sum/size;
        for(int i = 0; i<size; i++){
            if(list[i] > average){
                count++;
            }
        }
        StdOut.println((double)count /(double)size);

        //34-6
        double[] list = In.readDoubles();
        Arrays.sort(list);
        for(int i = 0; i<list.length; i++){
            StdOut.println(list[i]);
        }
        */
        
        //34-7
        double[] list = In.readDoubles();
        StdRandom.shuffle(list);
        for(int i = 0; i<list.length; i++){
            StdOut.println(list[i]);
        }
    }
}