import java.util.Random;
import java.util.Scanner;

public class randomNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int guess = 0;
        int min = 1;
        int max = 100;
        int attempts = 0;
        int randomnum = random.nextInt(min , max +1);

        System.err.println("Number Guessing Game !");
        System.err.printf("Guess the neumber between %d & %d \n", min, max);

        do{
            System.err.print("Enter your guess : ");
            String input = sc.nextLine();
            
            if (input.trim().isEmpty()) {

                System.err.println("You didn't enter anyting ! Try again !");
                continue;
                
            }
            
            try{
                guess=Integer.parseInt(input.trim());
            }
            catch (NumberFormatException e) {
                System.out.println("That's not a valid number! Try again.");
                continue;
            }

            attempts++;
            
            if(guess > randomnum){

                System.err.println("Number is too HIGH! Try again");

            }
            else if (guess < randomnum ) {

                System.err.println("Number is too LOW! Try agian");

            }
            else{

                System.err.println("CORRECT guess ! The number is : " +randomnum);
                System.err.println("# Number of attempts : " +attempts);
                break;
            }

        }while(guess != randomnum);

        sc.close();
    }
}