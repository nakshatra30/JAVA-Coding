class Bank {
    String Name;
    long accNo;
    double balance;

    Bank(String Name, long accNo, double balance) {
        this.Name = Name;
        this.accNo = accNo;
        this.balance = balance;
    }
}

class Main {
    public static void main(String[] args) {

        Bank s = new Bank("Rahul", 19912348964L, 50236.30);

        System.out.println("Name: " + s.Name);
        System.out.println("Account Number: " + s.accNo);
        System.out.println("Balance: " + s.balance);
    }
}