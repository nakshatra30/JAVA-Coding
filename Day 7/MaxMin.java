import java.util.*;
public class MaxMin {

    public static void findMax(int []nums){
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("Maximum values: "+max);
    }

    public static void findmin(int []nums){
        int min = nums[0];
        for(int i=1; i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("Minimum values: " +min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        int n = sc.nextInt();
        System.out.println("Enter the values: ");
        int [] nums = new int[n];
        for (int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        //METHOD TO FIND THE MAXIMUM VALUE
        findMax(nums);

        //METHOD TO FIND THE MINIMUM VALUE
        findmin(nums);

    }
}
