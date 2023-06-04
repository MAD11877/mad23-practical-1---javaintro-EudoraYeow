import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /*
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */

     //Scanner is to receive user input and parse them into primitive data types such as int, double or default string

    Scanner in = new Scanner(System.in); // creating a scanner object
    System.out.print("Enter height in cm: ");
    double height = in.nextDouble(); // reads the next line as a double 
    System.out.print("Enter weight in kg: ");
    double weight = in.nextDouble();
    double bmi = weight / (height * height);
    System.out.print("Your BMI is " + bmi);
  }
}