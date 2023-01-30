import java.util.Scanner;
public class TotalSec{
  /*program simplifies number of seconds to (hours, minutes, seconds) form*/
  public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter number of seconds: ");
    int tot_sec = myObj.nextInt();// 
    int hours = (tot_sec/3600);
    int m = (tot_sec - (tot_sec/3600)*3600);
    int minutes = (m/60);
    int seconds = m - (minutes*60);

  System.out.println(tot_sec + " seconds is equivalent to: " + hours + " hours, " + minutes + " minutes and, " + seconds + " seconds.");
    }
  
}