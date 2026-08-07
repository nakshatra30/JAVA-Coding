import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter float1");
        float float1 = sc.nextFloat();

        System.out.println("Enter float2");
        float float2 = sc.nextFloat();

        float average = (float1 +float2)/2;
        System.out.printf("Average= %.2f",average);


    }
    
}

