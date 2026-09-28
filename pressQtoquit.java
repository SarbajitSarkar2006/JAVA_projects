import java.util.Scanner;

public class pressQtoquit {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        String responce = "";

        while (!responce.equals("Q")) {

            System.err.println("Youre stuck in a Loop ");
            System.err.print("If you want to quit press Q : ");
            responce = sc.nextLine().toUpperCase();

        }

        System.err.println("Wallah ! you quit the game.");

        sc.close();
        
    }
    
}
