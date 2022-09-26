package ejercicio10;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// bloque de variables
		final int IVA = 21;
		double precioIntroducido;
		double precioConIVA;
		Scanner lectura = new Scanner(System.in);
		lectura.useLocale(Locale.US);
		
		//bloque de instrucciones
		// Solicitamos al usuario un precio
		System.out.print("Introduzca un precio: ");
		precioIntroducido = lectura.nextDouble();
		
		// Calculamos el precio con IVA
		precioConIVA = precioIntroducido * IVA /100 + precioIntroducido;
		
		// Mostramos el resultado por pantalla
		System.out.println("El precio con IVA es: " + precioConIVA);

	}

}
