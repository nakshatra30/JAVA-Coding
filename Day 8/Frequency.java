/*import java.util.Scanner;
public class Frequency {
    public static void freArray(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + "  " + count + " times");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        System.out.println("Enter the values:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Frequency:");
        freArray(arr);
        sc.close();
    }
}*/

//METHOD 2

public class Frequency{
    public static void main(String[] args) {
        int nums[] = {2, 2, 3, 4, 4, 2};
        boolean visited[] = new boolean[nums.length];
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(visited[i] == false){
                int count = 1;
                visited[i]=true;
                for(int j=i+1;j<len;j++){
                    if(nums[i]==nums[j]){
                        count++;
                        visited[j]=true;
                    
                    }
                }
                System.out.println(nums[i]+ " -> " +count );
            }
        }

    }
}