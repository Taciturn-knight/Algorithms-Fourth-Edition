/**
 * 编译: javac CircularRotation.java
 * 执行: java CircularRotation str1 str2
 * 依赖: StdOut.java
 * 
 * % java CircularRotation ACTGACG TGACGAC
 * true
 */
import edu.princeton.cs.algs4.*;

/**
 * Practice 1.2.6
 * {@code CircularRotation} 如果字符串s中字符循环移动任意位置后能够得到另一个字符串t，那么
 * s就称为t的回环变位。编写一个程序检查两个给定的字符串s和t是否互为回环变位。
 */
public class CircularRotation {

    public static void main(String[] args) {
        StdOut.println(((args[0] + args[0]).indexOf(args[1]) != -1));
    }
}