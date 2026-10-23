//import Scanner so we can get input from the user
import java.util.Scanner;
//Create a class named Calculator 
public class Calculator {
    //main method where program execution starts here
    public static void main (String[]args){
        //Create a Scanner object to read user input
        Scanner sc=new Scanner (System.in);

        //Prompt to let user enter the first and second numbers
        System.out.print("Enter your first number:");
        double num1=sc.nextDouble();
        System.out.print("Enter your second number:");
        double num2=sc.nextDouble();

        //Performs the basic calculations
        double sum =num1+num2;//addition
        double diff=num1-num2;//substraction
        double product=num1*num2;//multiplication
        double quotient=num1/num2;//division

        //display the calculation results
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+diff);
        System.out.println("Product: "+product);
        System.out.println("Quotient: "+quotient);

        //close Scanner 
        sc.close();
    }
}
