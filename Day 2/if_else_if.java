

public class if_else_if {
    public static void main(String[] args) {
    int age = 47;
      if(age <= 3){
          System.out.println("Child");
      }
      else if (age >= 4 && age <= 12) {
        System.out.println("Kid");
      }
      else if (age >= 13 && age <= 19) {
        System.out.println("Teenager");
      }
      else if (age >19 && age <= 60) {
        System.out.println("Adult");
      }
      else {
        System.out.println("Old");
      }
    }
    
    
    
}
