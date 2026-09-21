/*class Student {
    String Name;
    Student(){
        System.out.println("The object is created");
    }
    Student(String Name) {
        System.out.println("The object is created");
        this.Name = Name;
    }
    Student(Student obj){
        this.Name = obj.Name;
    }
}

class Main {

    public static void main(String[] args) {

        Student s = new Student();
        Student s1 = new Student("Rohit");
        Student s2 = new Student(s1);

        System.out.println(s1.Name);
        System.out.println(s2.Name);
    }
}*/

class Student {
    String Name;
    int age;
    Student(){
        System.out.println("The object is created");
    }
    Student(String Name) {
        System.out.println("The object is created");
        this.Name = Name;
    }
    Student(String Name, int age){
        this.Name = Name;
        this.age = age;
    }
}

class Main {

    public static void main(String[] args) {

        Student s = new Student();
        Student s1 = new Student("Rohit");
        Student s2 = new Student("Hari", 20);

        System.out.println(s1.Name);
        System.out.println(s2.age);
    }
}