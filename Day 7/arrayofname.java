import java.util.*;
public class arrayofname {
    static void printArray(String[]names){
        //print an array
        System.out.println("Names:");
        for(int i=0;i<names.length;i++){
        System.out.println(names[i]+" ");
        }
    }
        public static void main(String[]args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        String names [] = new String[size];
        System.out.println("Enter array Elements:");
        for(int i=0;i<size;i++){
        names[i]=sc.next();
        }
   //calling method to print array
        printArray(names);
    }
}