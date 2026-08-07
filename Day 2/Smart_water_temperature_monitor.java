import java.util.*;
public class Smart_water_temperature_monitor {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the temp: "); 
       int t = sc.nextInt();

       if (t<20) {
        System.out.println("Cold");
       }
       else if(t>20&&t<=40){
        System.out.println("Normal");
       }
       else{
        System.out.println("Hot");
       }
    }
}
