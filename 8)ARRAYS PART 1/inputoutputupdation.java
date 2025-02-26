import java.util.*;

public class inputoutputupdation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[100];

        // int phy;
        // phy = sc.nextInt();

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math

        System.out.println("physics " + marks[0] + '\n' + "chemistry "  + marks[1] +'\n' + "Maths " + marks[2]);

        marks[2]= marks[2]+1;


        System.out.println("Maths "+marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage =" + percentage + "%");


        //Calculating marks array length
        System.out.println("Length of array  = " + marks.length);
    }
}
