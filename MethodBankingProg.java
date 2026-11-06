import java.util.Scanner;

public class MethodBankingProg {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int choice;
        boolean run=true;
        double amount=0;

        while(run){
        //Tried to create a User interface , Not that cool but it works .
        System.out.println("\n___________________________");
        System.out.println("|     BANKING PROGRAM     |");
        System.out.println("___________________________");
        System.out.println("---Select your operation---");
        System.out.println("1.Show Balance");
        System.out.println("2.Deposite");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit\n");

        System.out.print("Enter Your Choice :");
        choice = sc.nextInt();

        System.out.println("____________________\n");

        //Switch Case
        switch (choice) {
            case 1 -> ShowBalance(amount);
            case 2 -> amount += Deposite();
            case 3 -> amount -= Withdraw(amount);
            case 4 -> run = false;
            default -> System.out.println("!INVALID CHOICE!");
        }
        System.out.println("\n\n____________________");
    }
    
    System.out.println("Thank you <3");

    sc.close();

  }
        
    //Methods
    static void ShowBalance(double amount){
        System.out.printf("₹%.2f", amount);

    }
    static double Deposite(){
        double creditedAmount ;

        System.out.print("Enter The Amount : ₹");
        creditedAmount = sc.nextDouble();

        if (creditedAmount < 0) {

            System.out.println("!!Invalid Amount!!");
            return 0;
        }
        else{
            return creditedAmount;
        }

    }
    static double Withdraw(double amount){
        System.out.print("Enter the Withdrawl Amount: ₹");
        double Withdrawlamount = sc.nextDouble();

        if (Withdrawlamount<0) {
            System.out.println("Amount can't be ZERO!/Negetive!");
            return 0;
        }
         else if (Withdrawlamount>amount) {
            System.out.println("!Invalid Amount!");
            return 0;
        }
        else{
            return Withdrawlamount;
        }

    }
}