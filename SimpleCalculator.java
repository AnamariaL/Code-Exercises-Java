import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		String operation;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		num1 = input.nextInt();
		
		System.out.println("Please enter the second number");
		num2 = input.nextInt();
		
		Scanner op = new Scanner(System.in);
		
		System.out.println("Please enter operation{+,-,/,*,%}");
		operation =op.next();
		
		if(operation.equals("+")) {
			System.out.println("your answer " + (num1+num2));
		}else if(operation.equals("-")) {
			System.out.println("your answer " + (num1-num2));
		}else if(operation.equals("/")) {
			System.out.println("your answer " + (num1/num2));
		}else if(operation.equals("*")) {
			System.out.println("your answer " + (num1*num2));
		}else if(operation.equals("%")) {
			System.out.println("your answer " + (num1%num2));
		}else {
			System.out.println("NO!!");
		}
		
		input.close();
		op.close();
	}

}
