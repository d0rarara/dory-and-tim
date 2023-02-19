import java.util.Scanner;
public class Name{
  public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    
    //set names to lowercase and remove whitespace 
    System.out.println("Enter first name: ");
    String first = myObj.nextLine().toLowerCase().trim(); 
    System.out.println("Enter last name: ");
    String last = myObj.nextLine().toLowerCase().trim();
    myObj.close();
    
    
    /* print full name in pig latin with the first letter capitalized
    for the first and last name; follow pig latin rule of moving the
    first letter to the end of the word and adding "ay" */

    System.out.println(first.substring(1,2).toUpperCase() + first.substring(2) + first.substring(0,1) + "ay " + last.substring(1,2).toUpperCase() + last.substring(2) + last.substring(0,1) + "ay ");

    

    
  }
}