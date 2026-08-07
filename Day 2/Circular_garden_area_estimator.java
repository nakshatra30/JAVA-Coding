import java.util.*;
public class Circular_garden_area_estimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        Float r = sc.nextFloat();

        double area = Math.PI*r*r;
        System.out.printf("Area: %.2f",+area);

    }
}
