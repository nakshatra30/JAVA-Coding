import java.util.*;

public class Entry_pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;
        int temp = n;
        int digits = 0;
        int sum = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("Qualifies");
        } else {
            System.out.println("Not Qualifies");
        }
    }
}
