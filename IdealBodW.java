import java.util.Scanner;
public class IdealBodW{
  public static final int feet = 5;
  public static final int pounds = 110;

  public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter height in feet: ");
    int height = myObj.nextInt();
    System.out.println("Enter inches: ");
    int inch = myObj.nextInt();
    myObj.close();

    if(height == feet){
      System.out.println("Your ideal body weight is: " + ((inch*5)+pounds));
    } else if(height > feet){
      System.out.println("Your ideal body weight is: " + (((12*5)+(inch*5))+pounds));
    }
  }
}