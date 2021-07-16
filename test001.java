import java.util.Scanner;

public class test001 {
    public static void main(String[] args){
        boolean ans = false;
        String genious = "Genious Quiz";
        Scanner scan = new Scanner(System.in);
        
        while(!ans){
            System.out.println("\tGenioquiz\t");
            System.out.println("Do you want to start? ");
            char a = scan.nextLine().charAt(0);

            if(a=='y'||a=='Y'){
                System.out.println("1- How many mundial titles Germany has? \n\ta-2\t\tb-4\t\n\tc-1\t\td-3\t\nYour answer: ");
                int b = scan.nextLine().charAt(0);
                if(b=='d'){
                    ans=true;
                }
            }
        }
    }
}
