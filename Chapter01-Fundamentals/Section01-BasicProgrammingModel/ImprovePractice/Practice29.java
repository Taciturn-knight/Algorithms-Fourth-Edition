/**
 * Practice29 
 */
public class Practice29 {
    public static int rank(int key, int[] a){
        int low = 0;
        int high = a.length-1;
        while (low <= high) {
            int middle = (low + high) >> 1;
            if(key < a[middle]) high = middle - 1;
            else if(key > a[middle]) low = middle + 1;
            else{
                while(middle > 0 && a[middle] == key)
                    middle--;
                return middle + 1;
            }
        }
        return -1;
    }

    public static int count(int key,int[]a) {
        int count = 0;
        int lower = rank(key,a);
        for(int i = lower; i<a.length; i++){
            if(a[i] == key)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] list = {1,1,1,2,3,4,5,6,7,8,8,8,9,10,11,11,12,14,15,16};
        StdOut.println(rank(8, list));
        StdOut.println(count(8, list));
    }

}