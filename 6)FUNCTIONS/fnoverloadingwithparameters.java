public class fnoverloadingwithparameters {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,2));
        System.out.println(sum(4,6,5));
    }
}
