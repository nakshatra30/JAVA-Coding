import java.util.*;

public class Financial_status_analyser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (n>0) {
            System.out.println("Profit"); 
        }
        else if(n<0){
            System.out.println("Loss");
        }
        else{
            System.out.println("No profit or loss");
        }
    }
}
