import java.util.*;

public class Sum {

    public static int findArraySum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter the values: ");
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // CALL THE METHOD
        int res = findArraySum(nums);

        System.out.println("Sum: " + res);
        sc.close();
    }
}