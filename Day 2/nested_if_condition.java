public class nested_if_condition {
    public static void main(String[] args) {
        int age = 15;
        if(age>=18){
            System.out.println("Adult");
            if(age>=60){
                System.out.println("Old Age");
            }
            else{
                System.out.println("Young");
            }
        }
        else{
            System.out.println("Minor");
            if (age<=10) {
                System.out.println("Child");
            }
        }

    }
    
}
