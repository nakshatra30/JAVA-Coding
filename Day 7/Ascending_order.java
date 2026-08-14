import java.util.*;
public class Ascending_order {

    public static void ascendingorder( int[] nums){
        int min = nums[0];
        for(int i=1; i<nums.length;i++){
            for(int j=1; j<i; j++){
            if(nums[i]<min){
                min=nums[i];
                min++;
            }
        }
    }
    System.out.println("Ascending order: "+min);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();

        System.out.println("Enter the values: ");
        int [] nums = new int[n];
        for (int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        //METHOD FOR PRINTING ASCENDING ORDER
        ascendingorder(nums);

    }
    
}
