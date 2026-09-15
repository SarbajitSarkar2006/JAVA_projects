import java.util.Scanner;

public class usernamecheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String username;

        System.err.println(" --------- ");
        System.err.println("| USERNAME| ");
        System.err.println(" ---------");
        System.err.print("Enter your username : ");
        username = sc.nextLine();

        if (username.length() < 4 || username.length() > 14 ) {

            System.err.println("Username must be 4 to 14 ");
            
        }
        else if (username.contains(" ") || username.contains("_")) {
            
            System.err.println("Username contains space or underscore.");
            
        }
        else{
            System.err.println("Hello ," + username);
        }

        sc.close();

    }
}
