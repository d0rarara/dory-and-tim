import java.util.Scanner;

public class BMI
{
    private double weight;
    private double height; 

    public double getBMI(){
        double value = this.weight/(this.height*this.height);
        return value;
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter weight");
        double weight = myObj.nextDouble();  // Read user input
        System.out.println("weight is: " + weight);
        
        System.out.println("Enter height");
        double height = myObj.nextDouble(); // Read user input
        System.out.println("height is: " + height);

        BMI myNewObj = new BMI();

        System.out.println("BMI is" + myNewObj.getBMI(weight, height));
    }
}

