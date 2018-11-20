import java.util.Scanner;

public class Ejercicio06 {
	private static Scanner in;
public static void main(String[] args) {
	int num= 0;
	System.out.println("Ingresa un número de hasta 3 cifras ");
	in = new Scanner(System.in);
	num = in.nextInt();
	if(num<-999 || num>999)
	{
		System.out.println(num+" Tiene más de 3 cifras");
	}
	else if(num<10 && num>-10)
	{
		System.out.println("El número "+num+" tiene 1 cifra");
	}
	else if(num<100 && num>-100)
	{
		System.out.println("El número "+num+ " tiene 2 cifras");
	}
	else
	{
		System.out.println("El número "+num+ " tiene 3 cifras");
	}
	
}
}
