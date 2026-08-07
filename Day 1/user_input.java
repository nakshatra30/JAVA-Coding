import java.util.Scanner;

class userInput{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Name: ");
        String name = in.nextLine();

        System.out.println("Enter your department: ");
        String department = in.nextLine();

        System.out.println("CGPA");
        float CGPA = in.nextFloat();

        System.out.println("Register number");
        long register_num = in.nextLong();

    

        System.out.println("Name: " + name + ", Department: " + department +
                            ", Register No: " + register_num + ", CGPA: " + CGPA);
    }
}