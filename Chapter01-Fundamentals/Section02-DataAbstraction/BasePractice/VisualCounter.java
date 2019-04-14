/**
 * ����: javac VisualCounter.java
 * ִ��: java VisualCounter count max
 * ����: StdIn.java StdOut.java StdDraw.java
 * 
 * % java VisualCounter 20 20
 * enter +/-
 * +
 * count: 1 value: 1
 * 
 */
import edu.princeton.cs.algs4.*;

/**
 * practice 1.2.10
 * {@code VisualCounter} ��дһ����VisualCounter��֧�ּ�һ�ͼ�һ���������Ĺ��캯��������
 * ������N��max������Nָ���˲�������������maxָ���˼�������������ֵ����Ϊ�����ã���ͼ����
 * ʾÿ�μ������仯���ֵ(x��Ϊ������y��Ϊֵ)
 * 
 */
public class VisualCounter {

    private int mValue;
    private int mMaxValue;
    private int mCount;
    private int mMaxCount;
    public VisualCounter(int N, int max){
        mMaxCount = N;
        mMaxValue = max;
        StdDraw.setXscale(0, mMaxCount);
        StdDraw.setYscale(-mMaxValue, mMaxValue);
    }

    public void increment() {
        if((mMaxCount >= mCount) && (Math.abs(mMaxValue) >= mValue)){
            mValue++;
            mCount++;
        }
        printAndDraw();
    }

    public void reduce() {
        if((mMaxCount >= mCount) && (Math.abs(mMaxValue) >= mValue)){
            mValue--;
            mCount++;
        }
        printAndDraw();
    }

    private void printAndDraw() {
        StdOut.printf("count: %d value: %d\n", mCount, mValue);
        if(mMaxCount == mCount){
            StdOut.println("Max Count!");
        }
        if(mMaxValue == mValue){
            StdOut.println("Max Value!");
        }
        StdDraw.point(mCount, mValue);
    }

    public static void main(String[] args) {
        VisualCounter test = new VisualCounter(Integer.parseInt(args[0]),
                                               Integer.parseInt(args[1]));
        StdOut.println("enter +/-");
        while (!StdIn.isEmpty()) {
            char c = StdIn.readChar();
            if     ('+' == c) test.increment();
            else if('-' == c) test.reduce();
        }
    }
}