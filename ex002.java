import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){

        
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scan.nextInt();

        switch(n1){
            case 1:
                System.out.println("Numero 1 ");
                break;
            case 2: case 3: case 4:
                System.out.println("Numero entre 2 e 4");
                break;
            case 5: case 6: case 7:
                switch(n1){
                    case 5:
                        System.out.println("numero 5");
                        break;
                    case 6:
                        System.out.println("numero 6");
                        break;
                    default:
                        System.out.println("numero 7");
                        break;
                }break;
            default:
                System.out.println("erro");
                break;
        }
    }
}
