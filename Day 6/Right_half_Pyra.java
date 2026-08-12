public class Right_half_Pyra {
    public static void main(String[] args) {
        int n = 25;
        for(int row = 1; row<=n; row++){

            for(int col = 1; col<=row; col++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
