import java.util.*;
///Integer.MIN_VALUE gives us -infinity
/// Integer.MAX_VALUE gives us +infinity
/// 

public class largestnumber {
    public static int smallest(int n[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            if(min>n[i]){
                min=n[i];
            }
        }
        return min;
    }
    public static int largest(int n[]){
        int max =Integer.MIN_VALUE;//-infinity
        for(int i=0;i<n.length;i++){
            if(max<n[i]){
                max=n[i];

            }
        }
        
        return max;
    }
    public static void main(String args[]){
        int numbers[] = {12,135,1234,5135,134,134,124};
        int maximum =largest(numbers);
        System.out.println("The maximum number is "+ maximum);

        int minimum = smallest(numbers);
        System.out.println("The Minimum number is " + minimum);
    }
}
