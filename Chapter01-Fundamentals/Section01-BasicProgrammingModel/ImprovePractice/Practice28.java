/**
 * Practice28 
 */
public class Practice28  {
    public static void main(String[] args) {
        
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        int size = whitelist.length-1;
        for(int i = 0; i<size; i++){
            if(whitelist[i] != whitelist[i+1]){
                StdOut.println(whitelist[i]);
            }
        }
    }
}