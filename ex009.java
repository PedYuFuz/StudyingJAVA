public class ex009{
    public static void main(String[] args){
        int nota=9;
        switch(nota){
            case 1:case 2:case 3: case 4:
                System.out.println("Reprovado!");
                break;
            case 5:case 6:
                System.out.println("Recuperação!");
                break;
            case 7:case 8:case 9:
                System.out.println("Aprovado!");
                break;
            case 10:
                System.out.println("Parabéns!");
                break;
            default:
                System.out.println("Error!");
        }

        for(int i=0;i<100;i++){
            
            if(i>15 && i<30)
                continue;

            System.out.println(i);
        }
    }
}