import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num1;
		int num2;
		String operation;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		num1 = input.nextInt();
		
		System.out.println("Please enter the second number");
		num2 = input.nextInt();
		
		Add add =new Add(num1,num2);
		
		Subtraction Sub = new Subtraction(num1,num2);
		
		Div div = new Div(num1,num2);
		
		Mod mod = new Mod(num1,num2);
		
		Multiplication mult = new Multiplication(num1,num2);
		
		Scanner op = new Scanner(System.in);
		
		System.out.println("Please enter operation{+,-,/,*,%}");
		operation =op.next();
		
		if(operation.equals("+")) {
			
			System.out.println("your answer " + add.total);
		}else if(operation.equals("-")) {
			System.out.println("your answer " + Sub.total);
		}else if(operation.equals("/")) {
			System.out.println("your answer " + div.total);
		}else if(operation.equals("%")) {
			System.out.println("your answer " + mod.total);
		}else if(operation.equals("*")) {
			System.out.println("your answer " + mult.total );
		}else {
			System.out.println("NO!!");
		}
		
		input.close();
		op.close();
	}

}
