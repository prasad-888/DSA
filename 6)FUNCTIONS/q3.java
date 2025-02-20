import java.util.*;

public class q3 {
    
    public static void isPalindrome(int n){
        int orignal = n;
        int rev =0;
        int digit;
        while(n>0){
            digit = n % 10;
            rev = rev* 10 + digit;
            n = n/10;
        }
        if(orignal == rev){
            System.out.println("The number is palindrome");

        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is palindrome or not");
        
        int a = sc.nextInt();

        isPalindrome(a);
    
    }
}
