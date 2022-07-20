import java.util.Scanner;

public class arith_cal {
	public static void main(String[] args) {
	
		// data type deleared	
		double first_input;
		double second_input;
		double result;
		char operator;

		System.out.print("Enter  any two number to perform operation = ");
		// oblect created to take the input
		Scanner scan = new Scanner(System.in);
		
        //typecasting used
		first_input = (float)scan.nextDouble();      //explicit typecast
		second_input = (double) scan.nextFloat();    //implicit typecast
		
		System.out.print("choose any operator for operation (+, -, *, /)= ");
		
		// oblect created to take the input
		operator = scan.next().charAt(0);

		switch (operator) {
		case '+':
			result = (first_input + second_input);
			break;
		case '-':
			result = (first_input - second_input);
			break;
		case '*':
			result = (first_input * second_input);
			break;
		case '/':
			result = (first_input / second_input);
			break;
		default:
			System.out.printf("incorrect operator chosen");
			return;
		}
		
		//Result is displayed
		System.out.print("Result:" + first_input + " " + operator + " " + second_input + " = " + result);

	}
}