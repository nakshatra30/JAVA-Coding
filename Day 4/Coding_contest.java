import java.util.*;
public class Coding_contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for(int i=2; i<=num-1; i++){
            if(num%i==0){
                isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not ELigible");
        }

    }
    
}
