import java.util.Scanner;

public class emailslicerprog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String email;
        String username;
        String domain;

        System.err.print("Enter your mail : ");

        email=sc.nextLine();

        if (email.contains("@")) {
            username=email.substring( 0,email.indexOf("@") );
        domain=email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);
            
        }
        else{
            System.err.println("your email dosen't contains @");
        }

        sc.close();
    }
}
