package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {
	}

	public static void mostrarMenu() {
		System.out.println("1º Opcion: Crear reina por defecto. ");
		System.out.println("2º Opcion: Crear reina eligiendo color. ");
		System.out.println("3º Opcion: Mover. ");
		System.out.println("4º Opcion: Salir. ");
	}

	public static int elegirOpcionMenu() {
		int opcionmenu;
		do {
			System.out.println("Escriba el numero de la opcion que desee elegir. ");
			opcionmenu = Entrada.entero();
		} while (opcionmenu < 1 || opcionmenu > 5);
		return opcionmenu;
	}

	public static Color elegirColor() {
		Color color = Color.BLANCO;
		int elegircolor;
		do {
			System.out.println("Escriba el numero del color que desee elegir para su reina: ");
			System.out.println("Escriba numero 1 para color BLANCO. ");
			System.out.println("Escriba numero 2 para color NEGRO. ");
			elegircolor = Entrada.entero();
		} while (elegircolor < 1 || elegircolor > 2);
		switch (elegircolor) {
		case 1:
			color = Color.BLANCO;
			break;
		case 2:
			color = Color.NEGRO;
			break;
		}
		return color;
	}

	public static void mostrarMenuDirecciones() {
		System.out.println(
				"Las direcciones a las que puede optar para mover su reina son las siguientes conjunto a los numeros a las que estan pertenecen: ");
		System.out.println("Numero 1 para NORTE");
		System.out.println("Numero 2 para SUR");
		System.out.println("Numero 3 para ESTE");
		System.out.println("Numero 4 para OESTE");
		System.out.println("Numero 5 para NORESTE");
		System.out.println("Numero 6 para NOROESTE");
		System.out.println("Numero 7 para SURESTE");
		System.out.println("Numero 8 para SUROESTE");
	}

	public static Direccion elegirDireccion() {
		Direccion direccion = Direccion.NORTE;
		int elegirdireccion;
		do {
			System.out.println("Escriba el numero de la direccion en la que desee moverse. ");
			elegirdireccion = Entrada.entero();
		} while (elegirdireccion < 1 || elegirdireccion > 8);
		switch (elegirdireccion) {
		case 1:
			direccion = Direccion.NORTE;
			break;
		case 2:
			direccion = Direccion.SUR;
			break;
		case 3:
			direccion = Direccion.ESTE;
			break;
		case 4:
			direccion = Direccion.OESTE;
			break;
		case 5:
			direccion = Direccion.NORESTE;
			break;
		case 6:
			direccion = Direccion.NOROESTE;
			break;
		case 7:
			direccion = Direccion.SURESTE;
			break;
		case 8:
			direccion = Direccion.SUROESTE;
			break;
		}
		return direccion;
	}

	public static int elegirPasos() {
		int elegirpasos;
		do {
			System.out.println(
					"Escriba la cantidad de pasos entre 1 y 7 (ambos incluidos) que desee que se mueva su reina. ");
			elegirpasos = Entrada.entero();
		} while (elegirpasos < 1 || elegirpasos > 7);
		return elegirpasos;
	}

	public static void despedirse() {
		System.out.println("Gracias por el uso de nuestra aplicacion, espero que le haya sido de agrado. ");
	}
}
