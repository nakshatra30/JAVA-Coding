import java.util.*;
public class movie_ticket_discount_validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        System.out.println("Ticket price: ");
        float price = sc.nextFloat();
        float totalprice;


        if (age<12) {
            totalprice = price - (price*50/100);
            System.out.println("Discount applied 50%");
             System.out.printf("Total Price= %.2f", +totalprice);
        }
        else if(age>60){
            totalprice = price - (price*30/100);
            System.out.println("30% discount");
             System.out.printf("Total Price= %.2f", +totalprice);
        }
        else{
            System.out.printf("Total Price= %.2f", +price);
        }

    }
}
