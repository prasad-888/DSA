import java.util.*;

public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int lastdigit=0;

        // while(n>0){
        //     lastdigit=n%10;
        //     n=n/10;
        //     System.out.print(lastdigit);
        // }
        int n=10899;
        int rev = 0;

        while(n>0){
            int lastdigit = n %10;
            rev = (rev*10) + lastdigit;
            n= n /10;
        }

        System.out.println(rev);
    }
}
