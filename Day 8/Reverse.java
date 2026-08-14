/*import java.util.Scanner;
public class Reverse {
    public static int[] revArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter the values: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // REVERSE THE ARRAY
        int[] rev = revArray(arr);

        System.out.println("Reversed Array:");

        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
        sc.close();
    }
} */

//METHOD 2 - WITHOUT RETURN STATEMENT
public class Reverse {
    public static void RevArray(int [] nums){
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;r--;
        }

    }
     public static void main(String[] args){
        int nums[] = {2,7,6,3,8,5};
        RevArray(nums);
        System.out.print("After Reversing:");
        for(int i=0;i<nums.length;i++){
           System.out.print(nums[i] +" ");
        }
        }
     }

