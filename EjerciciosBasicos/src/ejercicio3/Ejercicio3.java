package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Declaración de variables
		int actual; // En actual guardaremos el año actual
		int nacimiento; // En nacimiento guardaremos el año de nacimiento
		int edad; // En edad guardaremos la edad resultante
		
		// Creamos el Scanner para leer del teclado
		Scanner leer = new Scanner(System.in);
		
		// Le pedimos al usuario el año actual
		System.out.println("Introduzca el año actual: ");
		actual = leer.nextInt(); // leemos el año actual
		
		// Le pedimos al usuario el año de nacimiento
		System.out.println("Introduzca el año de nacimiento: ");
		nacimiento = leer.nextInt(); // llemos el año de nacimiento
		
		// Calculamos la edad
		edad = actual - nacimiento;
		
		// Le decimos al usuario la edad que tiene
		System.out.print("Usted tiene " + edad +  " años.");
	}

}
