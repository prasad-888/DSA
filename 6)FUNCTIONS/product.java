public class product {
    
    public static int product(int num1, int num2){
        int product = num1 * num2;
        return product;
    }
    
    public static void main(String args[]){
        int a=3;
        int b=5;
        int prod=product(a,b);
        System.out.println("The product of a*b =" +prod);
    
    }
}
