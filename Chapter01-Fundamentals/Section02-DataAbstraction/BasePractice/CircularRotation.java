/**
 * ����: javac CircularRotation.java
 * ִ��: java CircularRotation str1 str2
 * ����: StdOut.java
 * 
 * % java CircularRotation ACTGACG TGACGAC
 * true
 */
import edu.princeton.cs.algs4.*;

/**
 * Practice 1.2.6
 * {@code CircularRotation} ����ַ���s���ַ�ѭ���ƶ�����λ�ú��ܹ��õ���һ���ַ���t����ô
 * s�ͳ�Ϊt�Ļػ���λ����дһ�������������������ַ���s��t�Ƿ�Ϊ�ػ���λ��
 */
public class CircularRotation {

    public static void main(String[] args) {
        StdOut.println(((args[0] + args[0]).indexOf(args[1]) != -1));
    }
}