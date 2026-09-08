import java.util.Scanner;

public class weightconverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.err.println("--------------------------");
        System.err.println("Weight conversion program");
        System.err.println("--------------------------");

        System.err.println("Option 1. Kgs to lbs");
        System.err.println("Option 2. lbs to kgs");

        System.err.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice==1) {
            System.err.print("Enter your Weight in Kgs: ");
            weight=sc.nextDouble();
            newWeight= weight * 2.20462;
            System.err.printf("Your weight in Lbs: %.2f ", newWeight ); 
        }
        else if (choice==2) {
            System.err.print("Enter your Weight in Lbs: ");
            weight=sc.nextDouble();
            newWeight= weight * 0.453592;
            System.err.printf("Your weight in lbs: %.2f ", newWeight );
            
        }
        else{
            System.err.println("------------------------------");            
            System.err.println("!!Please select between 1&2!!");
            System.err.println("------------------------------");
        }

        sc.close();
    }
}    