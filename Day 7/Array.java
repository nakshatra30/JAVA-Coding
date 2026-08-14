
public class Array {
    public static void main(String[] args) {
        //Type1- Using new keyword
        int size = 5;
        /*int[] nums = new int [size];
        nums[0]=10;
        nums[1]=20;
        nums[3]=30;
        //Print array
       
        for(int i=0; i<size; i++){
        System.out.println(nums[i]);
        }*/

        //TYPE 2 - USING{}
        int marks [] = {98,95,56,88,75};
        int len = marks.length;
        for(int i=0; i<len; i++){
            System.out.println(marks[i]);
        }

    }
    
}
