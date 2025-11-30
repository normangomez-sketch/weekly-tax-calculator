import java.util.Scanner;

public class taxcalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {

            System.out.println("Weekly Tax Withholding Calculator");
            System.out.print("Enter weekly income: ");

            double income = scanner.nextDouble();
            double taxRate;

            if (income < 500) {
                taxRate = 0.10;
            } else if (income >= 500 && income < 1500) {
                taxRate = 0.15;
            } else if (income >= 1500 && income < 2500) {
                taxRate = 0.20;
            } else {
                taxRate = 0.30;
            }

            double taxWithheld = income * taxRate;

            System.out.println();
            System.out.println("Weekly income: $" + String.format("%.2f", income));
            System.out.println("Tax rate: " + String.format("%.0f", taxRate * 100) + "%");
            System.out.println("Weekly tax withheld: $" + String.format("%.2f", taxWithheld));
            System.out.println();

            System.out.print("Would you like to calculate another? (y/n): ");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("y")) {
                keepGoing = false;
            }

            System.out.println();
        }

        scanner.close();
        System.out.println("Thank you for using the Tax Calculator!");
    }
}

