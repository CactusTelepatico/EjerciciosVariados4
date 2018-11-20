import java.util.Scanner;

public class Ejercicio01 {
	private static Scanner in;
public static void main(String[] args) {
	double num1 = 0;
	double num2 = 0;
	double result1 = 0;
	double result2 = 0;
	System.out.println("Introduce un número: ");
	in = new Scanner(System.in);
	num1 = in.nextInt();
	System.out.println("Introduce el otro número: ");
	in = new Scanner(System.in);
	num2 = in.nextInt();
	if (num1 > num2)
	{
		result1 = num1 + num2;
		result2 = num1 - num2;
	}
	else
	{
		result1 = num1 * num2;
		result2 = num1 / num2;
	}
	System.out.println(result1);
	System.out.println(result2);
}
}
