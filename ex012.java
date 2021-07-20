import java.util.Scanner;

public class ex012 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final int numQuestions=5;
        int pointsPerQuestion = 2;
        int points=0;
        int errors=0;
        String name;
        char ans;
        char[] gabarito = {'a','c','b','c','c'};
        char[] answer = new char[numQuestions];
        String[] questions = {"Whats the biggest star in our Solar System?", "What is the first letter of the alphabeth?","2*10 is...?","The amazing world of ___?","Whats the value of PI?"};
        String[] alternatives={"a)Sun   |   b)Moon   |   c)Mars","a)Z   |   b)C   |   c)A","a)10   |   b)20   |   c)12","a)Bob   |   b)Carl   |   c)Gumball", "a)3.10   |   b)3   |   c)3.14"};
        

        for(int i=0;i<numQuestions;i++){
            System.out.println("Question "+(i+1));
            System.out.println(questions[i]);
            System.out.println(alternatives[i]);
            ans = scan.nextLine().charAt(0);
            if(ans == gabarito[i]){
                points+=pointsPerQuestion;
            }else{
                errors++;
            }
        }
        System.out.println("Your points: "+ points + "\nYour errors: "+ errors);
    }
}
