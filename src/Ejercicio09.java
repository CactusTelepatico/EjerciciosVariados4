import java.util.Scanner;

public class Ejercicio09 {
	private static Scanner in;

	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		int result = 0;
		do {
		System.out.println("Ingresa 3 valores iguales: ");
		in = new Scanner(System.in);
		num = in.nextInt();
		in = new Scanner(System.in);
		num2 = in.nextInt();
		if (num2 != num) {
			System.out.println("Revisa que los valores sean iguales!");
		} else {
			in = new Scanner(System.in);
			num3 = in.nextInt();
			if (num3 != num) {
				System.out.println("Revisa que los valores sean iaguales!");
			}
			else {
				result = (num + num)*num;
			}
			
		}
		}while(result != ((num + num)*num));
		System.out.println(result);

	}
}
