public class Main2 {
    
    public int add(int a,int b){
        int sum=a+b;
        return sum;

    }
    public static void main(String[] args) {
        Main2 obj=new Main2();
        int result= obj.add(8,2);
        System.out.println("Result:"+result);

    }
}
