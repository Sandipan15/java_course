package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){

        //Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //get the hourly pay rate
        System.out.println("Enter the pay rate: ");
        Scanner scanner1 = new Scanner(System.in);
        double payRate = scanner.nextDouble();
        scanner.close();

        //Multiply the working hours by pay rate
        double grossPay = hours * payRate;

        //Display result
        System.out.println("The employee's gross pay is $" + grossPay);


    }
}
