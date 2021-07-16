import java.util.Scanner;

public class ex001{
    public static void main(String[] args){
        float n1=0,n2=0,average=0;
        float MEDIA = 60;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextFloat();

        System.out.println("Digite a segunda nota: ");
        n2 = scan.nextFloat();

        average = (n1+n2)/2;

        String res = (average < MEDIA)?"Reprovado":"Aprovado";
        System.out.println("O(A) aluno(a) foi "+res+"(a)!");
    }
}