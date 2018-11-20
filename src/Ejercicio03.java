import java.util.Scanner;

public class Ejercicio03 {
	private static Scanner in;
public static void main(String[] args) {
	int num= 0;
	System.out.println("Ingresa un número entero de uno o dos dígitos: ");
	in = new Scanner(System.in);
	num = in.nextInt();
	if(num<1 || num>99)
	{
		System.out.println(num+" No es un número entero de uno o dos digitos");
	}
	else if(num>9)
	{
		System.out.println("El número "+num+" tiene 2 dígitos");
	}
	else if(num<10)
	{
		System.out.println("El número "+num+ " tiene 1 dígito");
	}
	
}
}
