public class binomialcoeefficient {
    
        public static int binomialcoefficient(int n, int r){
            int n_fact = factorial(n);
            int r_fact = factorial(r);
            int nmr_fact = factorial(n-r);

            return n_fact/(r_fact * nmr_fact);
        }
        public static int factorial(int n){
            int f=1;
            for(int i=1; i<=n; i++){
                f=f*i;
            }
            return f;
        }
    
        public static void main(String args[]){
            System.out.println(factorial(4));

            System.out.println(binomialcoefficient(5,2));
    
        }

    
}
