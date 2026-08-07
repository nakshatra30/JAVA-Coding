import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        Float a = sc.nextFloat();
        System.out.println("Enter the operator");
        char ch = sc.next().charAt(0);
        System.out.println("Enter b");
        Float b = sc.nextFloat();

        switch (ch) {
            case '+':
            System.out.println("Sum: " +(a+b));
            break;

            case '-':
            System.out.println("Sub: "+(a-b));
            break;

            case '*':
            System.out.println("Multiply: "+(a*b));
            break;

            case '/':
            System.out.println("Division: "+(a/b));
            break;

             default: 
             System.out.println("Invalid input!");
             break;
        }

    }
    
}
