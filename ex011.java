import java.util.Scanner;

public class ex011 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = scan.nextLine();

        //First question
        System.out.println("-----------------------------------");
        System.out.println("Question 1");
        System.out.println("Whats the biggest star in our Solar System?");
        System.out.println("a)Sun   |   b)Moon   |   c)Mars");
        char res = scan.nextLine().charAt(0);
        System.out.println("-----------------------------------");
        if(res=='a' || res=='A'){
            System.out.println("Question 2");
        System.out.println("What is the first letter of the alphabeth?");
        System.out.println("a)Z   |   b)C   |   c)A");
        char res1 = scan.nextLine().charAt(0);
        System.out.println("-----------------------------------");
            if(res1=='c' || res1== 'C'){
                System.out.println("Question 3");
            System.out.println("2*10 is...?");
            System.out.println("a)10   |   b)20   |   c)12");
            char res2 = scan.nextLine().charAt(0);
            System.out.println("-----------------------------------");
                if(res2=='b'||res2=='B'){
                    System.out.println("Question 4");
                System.out.println("The amazing world of ___?");
                System.out.println("a)Bob   |   b)Carl   |   c)Gumball");
                char res3 = scan.nextLine().charAt(0);
                System.out.println("-----------------------------------");
                    if(res3=='c'||res3=='C'){
                        System.out.println("Question 5");
                    System.out.println("Whats the value of PI?");
                    System.out.println("a)3.10   |   b)3   |   c)3.14");
                    char res4 = scan.nextLine().charAt(0);
                    System.out.println("-----------------------------------");
                    if(res4=='C'||res4=='c'){
                        System.out.println("Great job!");
                    }
                }
            }
        }
        }

    }
}
