import java.util.Scanner;

public class Ejercicio11 {
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
			num = in.nextInt();
			if (num < 10) {
				count++;
			}
			num = in.nextInt();
			if (num < 10) {
				count++;
			}
			if (count > 0) {
				System.out.println("Al menos uno de los números es menor que 10");
			}
			if (count <= 0) {
				count = 0;
			}
		} while (count <=0);
	}
}
