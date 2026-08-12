

public class ReverseNumber {
    public int reversenumber(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
        
    }
    public static void main(String[] args) {
        ReverseNumber obj=new ReverseNumber();
        System.out.println("Reverse Number:"+obj.reversenumber(1234));
    }
}
