import java.util.Scanner;

public class calculator{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double result=0;
        char operator;
        boolean validOperation = true;

        System.out.println("        --------------");
        System.out.println("        | CALCULATOR |");
        System.out.println("        --------------");

        System.err.print("Enter the first number : ");
        num1 = sc.nextDouble();

        System.err.println("            ------");
        System.err.println("           |SELECT|");
        System.err.println("            ------");
        System.err.println("\n     '+','-','*','/','^' \n\n");

        System.err.print("Enter your operation from above : ");
        operator = sc.next().charAt(0);

        System.err.print("\nEnter the second number : ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2==0) {
                    System.err.println("         -------------");
                    System.err.println("        | ! INVALID ! | ");
                    System.err.println("         -------------");
                    validOperation = false;                   
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow( num1, num2 );

            default -> {
                System.err.println("Invalid operator!");
                validOperation=false;
            }
        }

        if (validOperation) {
            System.err.println("            ------ ");
            System.err.println("           |RESULT|");
            System.err.println("            ------ ");
            System.err.printf("              %.1f",result);
        }
        sc.close();
    }
}