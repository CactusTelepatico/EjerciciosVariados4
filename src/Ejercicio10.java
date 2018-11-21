import java.util.Scanner;

public class Ejercicio10 {
	private static Scanner in;

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		do {
			System.out.println("Ingresa 3 números: ");
			in = new Scanner(System.in);
			num = in.nextInt();
			if (num < 10) {
				count++;
			}
			in = new Scanner(System.in);
			num = in.nextInt();
			if (num < 10) {
				count++;
			}
			in = new Scanner(System.in);
			num = in.nextInt();
			if (num < 10) {
				count++;
			}
			if (count == 3) {
				System.out.println("Todos los números son menores a 10");
			}
			if (count != 3) {
				count = 0;
			}
		} while (count != 3);
	}
}
