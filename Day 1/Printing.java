public class Printing {
    public static void main(String[] args) {
       String name = "Rajesh"; 
        int age = 25;
        double salary = 97500.5670;
        //System.out.println("Name: "+name+", age: "+age);
        //%n - for new line
        //Basic
        System.out.printf("Name: %s, age: %d%n",name,age);
        //Formatting with width and precision 
        System.out.printf("Salary: $%, .2f",salary);



      
    }
    
}
