import java.util.Scanner;

public class shoppingcart{
    public static void main(String[] args){

        // Shopping cart 
        Scanner sc = new Scanner(System.in);

        String food;
        double price;
        int quantati;
        double total;
        char currency = '₹' ;

        System.out.print("What would you like to buy ? :  ");
        food = sc.nextLine();

        System.out.print("What is the price for each :");
        price = sc.nextDouble();

        System.out.print("How many do you want to purchase ? : ");
        quantati = sc.nextInt();

        total = quantati * price;

        System.out.print("\nThe total amount will be : " + total + currency);

        sc.close();
    }
}