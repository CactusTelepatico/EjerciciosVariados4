import java.util.Scanner;

public class Ejercicio02 {
	private static Scanner in;
public static void main(String[] args) {
	int nota1 = 0;
	int nota2 = 0;
	int nota3 = 0;
	int sum = 0;
	int prom = 0;
	System.out.println("Ingresa la 1ª nota: ");
	in = new Scanner(System.in);
	nota1 = in.nextInt();
	System.out.println("Ingresa la 2ª nota: ");
	in = new Scanner(System.in);
	nota2 = in.nextInt();
	System.out.println("Ingresa la 3ª nota: ");
	in = new Scanner(System.in);
	nota3 = in.nextInt();
	
	sum= nota1 + nota2 + nota3;
	prom = sum /3;
	if(prom >=7)
	{
		System.out.println("Promocionado");
	}
	else
	{
		System.out.println("No promocionado");
	}
}
}
