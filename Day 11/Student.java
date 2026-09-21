class Student {

    String Name;

    Student(){
        System.out.println("The object is created");
    }
    Student(String Name) {
        System.out.println("The object is created");
        this.Name = Name;
    }
}

class Main {

    public static void main(String[] args) {

        Student s = new Student();
        Student s1 = new Student("Rohit");

        System.out.println(s1.Name);
        System.out.println(s.Name);
    }
}