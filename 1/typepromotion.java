import java.util.*;

// Java automatically promotes each byte,short, or char operand to int
// when evaluating an expression.

// If one operand is long, float or double the whole expression is 
//promoted to long,float, or double respectively.





public class typepromotion {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    // rule 1
    // char a ='a';
    // char b='b';
    // System.out.println((int)(b));
    // System.out.println((int)(a));
    // System.out.println(b-a);


    // rule 2
    // int a=10;
    // float b =20.25f;
    // long c = 25;
    // double d = 30;
    // double ans = a+b+c+d;

    // System.out.println(ans);



    // Type Promotion in Expressions

    //wrong
    // byte b =5;
    // b = b*2;  // by rule 1 it will convert it into int type

    //right
    byte b =5;
    b = (byte) (b*2);


  }  
}
