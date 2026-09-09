import java.util.Scanner;

public class tempconverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.err.println("---------------------");
        System.err.println("Temperature Converter");
        System.err.println("---------------------");

        System.err.print("Enter the temperature:");
        temp = sc.nextDouble();

        System.err.print("Type C for celsius and F for fahrenheit:");
        unit = sc.next().toUpperCase();

        newtemp = (unit.equals("C")) ? (temp - 32)* 5 / 9 : (temp * 5 / 9) + 32;

        System.err.printf("%.2f° %s ", newtemp, unit);

        sc.close();

    }
}