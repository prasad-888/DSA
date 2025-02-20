import java.util.*;


public class q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of whose digit you want sum");

        int a = sc.nextInt();

        int x = Sumofdigits(a);

        System.out.println(" The Sum of Digits of  " + a +" = " + x);
    }

    public static int Sumofdigits(int n){
        int sum =0;
        while(n>0){
            sum = sum + n%10;
            n=n/10;
        }
        return sum;
    }

}