import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner (System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		
		A = sc.nextDouble ();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		
		triangulo = A * C / 2;
		circulo = C * C * pi;	
		trapezio = (A + B) *C / 2; 
		quadrado = B * B;
		retangulo = A * B;
		
	System.out.printf("TRIANGULO: %.3f%n", triangulo);
	System.out.printf("CIRCULO: %.3f%n", circulo);
	System.out.printf("TRAPEZIO: %.3f%n", trapezio);
	System.out.printf("QUADRADO: %.3f%n", quadrado);
	System.out.printf("RETANGULO: %.3f%n", retangulo);
	
	sc.close();
	}

}
