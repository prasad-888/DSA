public class floydstriangle {
    
    public static void j(int n){
        int counter =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(counter+ " ");
                    counter++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        j(5);
    }
}
