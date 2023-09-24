import java.util.Scanner;

public class Calculator {
	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	
		int operator;
		double result = 0;
		double number1;
		double number2;
	
		System.out.println("1-Add\n2-Subtract\n3-Multiply\n4-Divide");
		System.out.println("Enter the operator of choice: ");
		operator = input.nextInt();
		System.out.println("Enter number 1: ");
		number1 = input.nextDouble();
		System.out.println("Enter number 2: ");
		number2 = input.nextDouble();
		
		switch(operator) {
		case 1:
			result = number1 + number2;
			break;
			
		case 2:
			result = number1 - number2;
			break;
			
		case 3:
			result = number1 * number2;
			break;
			
		case 4:
			result = number1 / number2;
			break;
			
			default:
				System.out.println("Invalid operator entered");
		}
		System.out.println("Result is: " + result);
		
		
		
		
		
		
	}

}
