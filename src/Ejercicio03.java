import java.util.Scanner;

public class Ejercicio03 {
	private static Scanner in;
public static void main(String[] args) {
	int num= 0;
	System.out.println("Ingresa un n�mero entero de uno o dos d�gitos: ");
	in = new Scanner(System.in);
	num = in.nextInt();
	if(num<1 || num>99)
	{
		System.out.println(num+" No es un n�mero entero de uno o dos digitos");
	}
	else if(num>9)
	{
		System.out.println("El n�mero "+num+" tiene 2 d�gitos");
	}
	else if(num<10)
	{
		System.out.println("El n�mero "+num+ " tiene 1 d�gito");
	}
	
}
}
