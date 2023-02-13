import java.util.Scanner;
public class GPA {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your grade (in %): ");
		double grade = myObj.nextDouble();
		double gpa = (grade/100)*4;
		System.out.println("Your GPA is: \n" + gpa);
	}
}