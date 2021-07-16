import java.util.Arrays;

public class ex004 {
    public static void main(String[] args){
        int[] num = {5,3,2,7,0,1};
        Arrays.sort(num);
        System.out.println(num[4]);
        System.out.printf("O numero 5 está na posição %d", Arrays.binarySearch(num, 5));
    }
}
