import java.util.Scanner;

public class ex003{
    public static void main(String[] args){
        int size = 5;
        int a=0,b=0,c=0,d=0,e=0;
        char[] answer = new char[size];

        Scanner scan = new Scanner(System.in);

        for(int i=0;i<size;i++){
            System.out.printf("Digite sua resposta da questão %d: ", (i+1));
            answer[i] = scan.nextLine().charAt(0);
            //System.out.print("\n");
            switch(answer[i]){
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'c':
                    c++;
                    break;
                case 'd':
                    d++;
                case 'e':
                    e++;
                    break;
                default:
                    System.out.println("ERROR!");
                    System.out.printf("Digite sua resposta da questão %d: ", (i+1));
                    answer[i] = scan.nextLine().charAt(0);
                    //System.out.print("\n");
                    break;
            }
        }
        System.out.printf("\nLetra a: %d\nLetra b: %d\nLetra c: %d\nLetra d: %d\nLetra e: %d\n", a,b,c,d,e);
    }
}