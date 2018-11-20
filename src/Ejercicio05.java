import java.util.Scanner;

public class Ejercicio05 {
	private static Scanner in;
public static void main(String[] args) {
	int num =0;
	System.out.println("Ingresa el segundo número: ");
	in = new Scanner(System.in);
	num = in.nextInt();
	if (num<0)
	{
		System.out.println(num+" Es negativo");
	}
	else if(num>0)
	{
		System.out.println(num+" Es positivo");
	}
	else
	{
		System.out.println(num+" Es nulo");
	}
}
}
