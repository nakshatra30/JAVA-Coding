import java.util.*;
public class Special_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value1: ");
        int v1 = sc.nextInt();

        System.out.println("Enter the Value2: ");
        int v2 = sc.nextInt();
        int result;
        for(int i=v1; i<=v2; i++){
            int dig1 = i%10;
            int dig2 = i/10;

            int sum = dig1+dig2;
            int prod = dig1*dig2;
            result = sum+prod;

            if(result==i){
                System.out.print(i+ " ");
            }
           
        }
     }
}
