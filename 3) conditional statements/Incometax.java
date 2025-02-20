import java.util.*;

public class Incometax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax;
        if( income<500000){
            System.out.println("0% Tax");
            tax=0;
        }
        else if(500000<=income && income<=1000000){
            System.out.println("20% tax");
            tax= 0.20f * income;

        }

        else{
            tax = 0.3f * income;
        }

        System.out.println("Your Tax is:" +tax);
    }
}
