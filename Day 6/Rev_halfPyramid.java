
public class Rev_halfPyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int row = n; row>0; row--){
            for(int col = row; col>=1; col--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
