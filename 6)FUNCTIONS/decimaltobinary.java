public class decimaltobinary {


    public static void decimaltobinary(int n){
        int myNum = n;
        int pow=0;
        int bin =0;
        while(n>0){
            int rem = n % 2;
            bin = bin + (int)(rem * Math.pow(10,pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary form of "+myNum + " is "+bin);
    }
    public static void main(String args[]){
        decimaltobinary(11);
    }
}
