import java.util.Scanner;
public class Coupons {


    public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter number of coupons: ");
      int cps = keyboard.nextInt(); //Read coupon value
      keyboard.close();

      if(cps>=13){
        System.out.println("You can get a candy bar AND a gumball...werk!");
      } else if(cps >= 10 && cps <= 12){
        System.out.println("You can get a candy bar!");
      } else if(cps >= 3 && cps < 10){
        System.out.println("All you get is a gumball...");
      } else {
        System.out.println("Sorry, you're broke!");
      }
      
        
    }
}
