import java.util.Scanner;
public class Hate{

  public static void main(String[] args){
    String a = "hate";
    Scanner myObj = new Scanner(System.in);
    /*this program will change the first occurence of the word     
    'hate' and change it to 'love'*/
    System.out.println("The line of text to be changed is: ");
    String oldLine = myObj.nextLine();
    String newLine = oldLine.replaceFirst(a,"love");

    if(a.equalsIgnoreCase(a)){
      System.out.println("I have rephrased that line to read: " + "\n" + newLine);
      
    }else{
      System.exit(0);
    }
  
    
    
  }
}