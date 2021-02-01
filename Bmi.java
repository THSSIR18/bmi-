import java.util.Scanner;
public class Bmi
{ 
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your weight in pounds: ");	
		double weight = sc.nextDouble();
		System.out.print("Enter your height in inches: ");
		double height = sc.nextDouble();
		double heightCon= height * .0254;
		double weightCon = weight * .454;
		double total= weightCon / (heightCon * heightCon);
		System.out.println("The BMI is: " + total);
	}
}