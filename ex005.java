import java.security.*;

public class ex005 {
    public static void main(String[] args){
        final int lines = 3;
        final int column = 3;
        int[][] matriz = new int[lines][column];

        for(int i=0;i<lines;i++){
            for(int j=0;j<column;j++){
                //esse 10 em nextInt é o max. que o random gera, provavelmente até 9, no caso.
                matriz[i][j]=new SecureRandom().nextInt(10);
            }
        }
        for(int[] n:matriz){
            for(int m:n){
                    System.out.printf("|%2d ", m);
            }
            System.out.print("|\n");
        }
    }
}
