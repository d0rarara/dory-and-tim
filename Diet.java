import java.util.Scanner;
public class Diet{
  public static final double DEATH_AMOUNT = 0.000085;
  public static final double MOUSE_WEIGHT = 0.017;
  public static final double STARTING_WEIGHT = 68.0;
  /*weight at which the dieter will stop dieting*/
  public static final double DESIRED_WEIGHT = 68.5; 

  public static void main(String [] args){
    Scanner myObj = new Scanner (System.in);
    System.out.println("Enter number of diet sodas: ");
    double n = myObj.nextDouble();
    double soda = 0.001*n;
    myObj.close();

    double a = STARTING_WEIGHT + (soda*100);
    double b = MOUSE_WEIGHT;
    
    if((soda >= DEATH_AMOUNT && b >= 0.01) && a >= DESIRED_WEIGHT){
      System.out.println("You would be dead if you were a mouse. ");
      System.out.print("I would stop if I was you...");
    }else if(a<DESIRED_WEIGHT){
      System.out.println("Nothing to worry about. Treat yourself!");
    }else{
      System.exit(0);
    }
    

    
  }
}