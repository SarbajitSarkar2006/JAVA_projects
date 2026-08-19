import java.util.Scanner;

public class madlibsgame {
    public static void main(String[] args){
        //Mad libs game

        Scanner sc = new Scanner(System.in);

        String noun1;
        String adjective1;
        String noun2;
        String verb1;
        String noun3;

        System.out.print("Enter a name (person or animal ): ");
        noun1 = sc.nextLine();
        System.out.print("Enter a name of a place : ");
        noun2 = sc.nextLine();
        System.out.print("Enter another name (Animal): ");
        noun3 = sc.nextLine();
        System.out.print("Enter an expression : ");
        adjective1 = sc.nextLine();
        System.out.print("Enter an action : ");
        verb1 = sc.nextLine();

        System.out.println("Hi , i am a/an" + noun1 + " nice to meet you . " );
        System.out.println("I want to go to the " + noun2 + " and have fun. ");
        System.out.println("The "+ noun3 +" who is right next to me is " + adjective1 );
        System.out.println("I said to the person to move " + verb1 + " me" );

        sc.close();
    }   
}