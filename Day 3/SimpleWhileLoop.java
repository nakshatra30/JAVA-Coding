public class SimpleWhileLoop {
    public static void main(String[] args) {
        int num = 255;
        int n = 5;
        int count = 0;
        while(num>=n){
            count++;
            num = num/n;
        }
        System.out.println(count);
    }
    
}
