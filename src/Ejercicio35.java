import java.util.Scanner;

public class Ejercicio35 {
	private static Scanner in;
public static void main(String[] args) {
	int num = 0;
	int sum =0;
	int count=0;
	System.out.println("Introduce el número: ");
	in = new Scanner(System.in);
	num= in.nextInt();
	;
	for(int i=0;i<5;i++) {
		
		for(;count!=4;count++) {
			if(num<10) {
				System.out.print(" ");
			}
				
			System.out.print(num+" ");
			num++;
		}
		if(num<10) {
			System.out.print(" ");
		}
		System.out.println(num+" ");
		num++;
		count = 0;
	}
	
	
}
}
