import java.util.Scanner;

public class DivQ {
  public static void main(String[] args) {
	//program should output the dividend, divisor, quotient, and remainder on the screen


    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int n1 = myObj.nextInt();
    System.out.println("Enter second number: ");
    int n2 = myObj.nextInt();
    myObj.close();

    int quotient = n1 / n2;
    int remainder = n1 % n2;

    System.out.println(n1 + "/" + n2 + " gives " + quotient + " as a quotient and " + remainder + " as a remainder!");
  }
}