import java.util.Scanner;

public class Ejercicio04 {
	private static Scanner in;
public static void main(String[] args) {
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	System.out.println("Ingresa 3 números distintos: ");
	in = new Scanner(System.in);
	num1 = in.nextInt();
	System.out.println("Ingresa el segundo número: ");
	in = new Scanner(System.in);
	num2 = in.nextInt();
	if(num1 ==num2)
	{
		System.out.println("No son distintos");
	}
	else {
		System.out.println("Ingresa el tercer número: ");
		in = new Scanner(System.in);
		num3 = in.nextInt();
		if(num3 == 2 || num3 ==num1)
		{
			System.out.println("No son distintos");
		}
		else {
			if(num1 > num2 && num1 > num3)
			{
				System.out.println(num1+" Es el mayor de estos 3 números distintos");
			}
			if(num2 > num1 && num2 > num3)
			{
				System.out.println(num2+" Es el mayor de estos 3 números distintos");
			}
			else
			{
				System.out.println(num3+" Es el mayor de estos 3 números distintos");
			}
		}
	}
	
}
}