/**
 * ����: javac SmartDate.java
 * ����: java SmartDate year month day
 * ����: StdOut.java
 * 
 * % java SmartDate 2018 3 13
 * 2018-03-13
 * 72
 * Tuesday
 */
import edu.princeton.cs.algs4.*;
/**
 * Practice 1.2.11
 * {@code SmartDate} ����Date��APIʵ��һ��SmartDate���ͣ������ڷǷ�ʱ�׳�һ���쳣��
 */
public class SmartDate {
    private static final int[] DAYS = { 0, 31, 29, 31, 30, 31, 30,
                                           31, 31, 30, 31, 30, 31 };
    private static final String[] WEEK = {"Monday", "Tuesday", "Wednesday",
                                          "Thursday", "Friday", "Saturday",
                                          "Sunday"};
    private int year;   // year >= 0
    private int month;  // 1 <= month <= 12
    private int day;    // 1 <= day <= DAYS[month]
    private int doy;    // day to year 0 <= 365;
    private int dow;    // day to week 0 <= 6

    public SmartDate(int y, int m, int d){
        if(!isValid(y, m, d))
            throw new IllegalArgumentException("Invalid date");
        
        this.year = y;
        this.month = m;
        this.day = d;
        this.doy = dayToYear(y, m, d);
        this.dow = dayOfWeek(y, m, d);
    }

    public int year(){
        return this.year;
    }

    public int month(){
        return this.month;
    }

    public int day(){
        return this.day;
    }

    public int dayToYear(){
        return this.doy;
    }

    public static int dayToYear(int y, int m, int d) {
        return (m * 275 / 9) 
          - ((m + 9) / 12)
          * (((y - 4 * (y / 4) + 2) / 3) + 1)
          + d - 30;
    }

    /**
     * Practice 1.2.12
     * {@code dayOfWeek} ΪSmartDate���һ������{@code dayOfWeek()}��Ϊ������ÿ�ܵ���
     * ����Monday��Tuesday��Wednesday��Thursday��Friday��Saturday��Sunday��
     * 
     * Zeller��ʽ�ĸı����㣬���������1��1�յ����ڣ�Ȼ���ý��������������������ڡ�
     */
    private static int dayOfWeek(int y, int m, int d) {
        int _doy = dayToYear(y, m, d);
        int _year = y - 1;
        int _y = _year % 100;
        int _c = _year / 100;
        int _w = (_y + (_y / 4) + (_c / 4) - 2 * _c + 36) % 7 + ((_doy - 2) % 7); 
        if(_w < 0)   // ��ֹ�������
            _w += 7;
        return _w;
    }
    public static String dayOfTheWeek(int y, int m, int d){
        return WEEK[dayOfWeek(y, m, d)];
    }

    public String dayOfTheWeek(){
        return WEEK[this.dow];
    }

    private static boolean isValid(int y, int m, int d){
        if(y < 0) return false;
        if(1 > m || m > 12) return false;
        if(0 > d || d > DAYS[m]) return false;
        if(m == 2 && d == 29 && !isLeapYear(y)) return false;
        return true;
    }

    private static boolean isLeapYear(int y){
        if(y % 400 == 0) return true;
        if(y % 100 == 0) return false;
        return y % 4 == 0;
    }

    public static void main(String[] args) {
        int y = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int d = Integer.parseInt(args[2]);
        SmartDate date = new SmartDate(y, m, d);
        StdOut.printf("%d-%02d-%02d\n", date.year(), date.month(), date.day());
        StdOut.println(date.dayToYear());
        StdOut.println(date.dayOfTheWeek());
    }
    
}