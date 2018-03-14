/**
 * 编译: javac VisualCounter.java
 * 执行: java VisualCounter count max
 * 依赖: StdIn.java StdOut.java StdDraw.java
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
 * {@code VisualCounter} 编写一个类VisualCounter，支持加一和减一操作。它的构造函数接受两
 * 个参数N和max，其中N指定了操作的最大次数，max指定了计数器的最大绝对值。作为副作用，用图像显
 * 示每次计数器变化后的值(x轴为次数，y轴为值)
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