public class binarytodecimal {

    public static void binarytodecimal(int binum){
        int myNum = binum;
        int pow=0;
        int Decnum=0;
        while(binum>0){
            int LastDigit= binum % 10;
            Decnum = Decnum + (int)(LastDigit * Math.pow(2, pow));

            pow++;
            binum = binum /10;
        }

        System.out.println("The Decimal No of " + myNum +" = " + Decnum);
    }
    public static void main(String args[]){
        binarytodecimal(101);
        binarytodecimal(111);
        binarytodecimal(1010);
    }
}
