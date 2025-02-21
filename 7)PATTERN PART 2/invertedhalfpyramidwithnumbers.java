public class invertedhalfpyramidwithnumbers {
    static void m(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            n = n-1;
            System.out.println();
        }
    }
    public static void main(String args[]){
        m(5);
    }
}
