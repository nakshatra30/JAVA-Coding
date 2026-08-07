import java.util.*;
public class Secure_login_authentication_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sc.nextLine();

        System.out.println("Password: ");
        String password = sc.nextLine();

        if (username.isEmpty()) {
            System.out.println("Invalid username!");
        }
        else if (password.length()<6) {
            System.out.println("Invalid Password!");
        }
        else{
            System.out.println("Login Successful");
        }

    }
    
}
