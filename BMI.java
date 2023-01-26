import java.util.Scanner;
/* wooo I did it */
public class BMI {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object

    System.out.println("Enter weight (kg): ");
    double weight = myObj.nextDouble(); // Read user input
    System.out.println("Entered weight (kg) is: " + weight);

    System.out.println("Enter height (m): ");
    double height = myObj.nextDouble(); // Read user input
    System.out.println("Entered height (m) is: " + height);


    System.out.println("Your BMI is " + ((weight)/(height*height)));
  }
}
