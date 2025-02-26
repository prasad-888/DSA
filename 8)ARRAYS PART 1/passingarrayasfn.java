import java.util.*;


public class passingarrayasfn {

    public static void update(int marks[], int nonchangable){
        
        nonchangable = 10;
        for(int i=0;i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int marks[]={97, 98, 99};
        int nonchangable =5;
        // calling by reference
        update(marks, nonchangable);
        
        System.out.println(nonchangable);
        // print our marks

        for(int i=0;i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
