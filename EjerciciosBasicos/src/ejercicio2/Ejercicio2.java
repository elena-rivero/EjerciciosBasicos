package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Le pedimos al usuario su edad
		System.out.print("Introduzca su edad: ");
		
		// Variable donde se guardará la edad
		int edad;
		
		// Creamos Scanner para leer del teclado
		Scanner leerEdad = new Scanner(System.in);

		// Leemos la edad
		edad = leerEdad.nextInt();
		
		// Añado 1 a la edad actual
		edad++;
		
		// Muestro por pantalla el mensaje
		System.out.println("Usted tendrá el año que viene " + edad + " años.");
		
	}

}
