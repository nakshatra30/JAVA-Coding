public class Main{

    public int add(){
       int a=6;
       int b=4;
       int sum=(a+b);
       return sum;
    }
    public static void main(String[] args) {
        Main obj=new Main();
        int res=obj.add();
        System.out.println("Res:"+res);
    }
}