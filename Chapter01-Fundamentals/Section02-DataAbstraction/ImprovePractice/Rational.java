/**
 * 编译: javac Rational.java
 * 运行: java Rational a b c d
 * 依赖: StdOut.java
 * 
 * % java Rational 11 22 9 22
 * 1/2
 * 9/22
 * +: 10/11
 * -: 1/11
 * *: 9/44
 * /: 11/9
 * ==: false
 */
import edu.princeton.cs.algs4.*;
/**
 * Practice 1.2.16
 * {@code Rational} 为有理数实现一个不可变数据类型Rational,支持加减乘除操作。使用欧几里得
 * 算法来保证分子和分母没有公因子。
 */
public class Rational {

    private long mNumerator;
    private long mDenominator;

    public Rational(long numerator, long denominator){
        long gcd = euclid(numerator, denominator);
        this.mNumerator = numerator / gcd;
        this.mDenominator = denominator / gcd;
    }

    public Rational plus(Rational b){
        long num = this.mNumerator * b.mDenominator 
                 + this.mDenominator * b.mNumerator;
        long den = this.mDenominator * b.mDenominator;
        return new Rational(num, den);
    }

    public Rational minus(Rational b){
        long num = this.mNumerator * b.mDenominator 
                 - this.mDenominator * b.mNumerator;
        long den = this.mDenominator * b.mDenominator;
        return new Rational(num, den);
    }
    public Rational times(Rational b){
        long num = this.mNumerator * b.mNumerator;
        long den = this.mDenominator * b.mDenominator;
        return new Rational(num, den);
    }

    public Rational divides(Rational b){
        long num = this.mNumerator * b.mDenominator;
        long den = this.mDenominator * b.mNumerator;
        return new Rational(num, den);
    }

    public boolean equals(Rational that){
        return (this.mNumerator == that.mNumerator) &&
               (this.mDenominator == that.mDenominator);
    }

    public String toString(){
        return String.valueOf(this.mNumerator) 
               + "/" +
               String.valueOf(this.mDenominator);
    }

    public static long euclid(long a, long b){
        if(a < b)
        {
            long temp = a;
            a = b;
            b = temp;
        }
        return (b == 0) ? a : euclid(b, (a % b));
    }

    public static void main(String[] args) {
        Rational a, b;
        a = new Rational(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        StdOut.println(a.toString());
        b = new Rational(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        StdOut.println(b.toString());
        StdOut.printf("+: %s\n",a.plus(b));
        StdOut.printf("-: %s\n",a.minus(b));
        StdOut.printf("*: %s\n",a.times(b));
        StdOut.printf("/: %s\n",a.divides(b));
        StdOut.printf("==: " + (a.equals(b) ? "true" : "false"));
    }
}