import java.util.Scanner;
public class SimpInt{
  public static void main(String[] args){
    double int_rate = 5.0;
    int no_of_yrs = 5;

    Scanner myObj = new Scanner (System.in);
    System.out.println("Enter loan amount: ");
    double princi_amnt = myObj.nextDouble();
    myObj.close();
    System.out.println("The simple interest of the loan is: " + (princi_amnt*int_rate*no_of_yrs)/100 );

    
  }
}