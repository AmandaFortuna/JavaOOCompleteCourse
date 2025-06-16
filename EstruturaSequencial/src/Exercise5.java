import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cod1, cod2, número1, número2;
		double valor1, valor2, total;
		
		cod1 = sc.nextInt();
		número1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		número2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = número1 * valor1 + número2 * valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
