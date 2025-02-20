// Write a program to find the factorialof any number entered by the user.
// (Hint:factorialofanumbern=n*(n-1)*(n-2)*(n-3)*......*1andexistsforpositivenumbersonly. 
// We write factorial as n!So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.Note 
// - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)
import java.util.*;
public class hw3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;

        }
        System.out.println("Factorial" + factorial);
    

    }
}
