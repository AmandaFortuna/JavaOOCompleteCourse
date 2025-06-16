import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double A;
		double R;
		double pi = 3.14159;
		
		R = sc.nextDouble();
		
		A = pi * R * R;
		
		System.out.printf("A= %.4f%n", A);
		
		sc.close();
	}

}
