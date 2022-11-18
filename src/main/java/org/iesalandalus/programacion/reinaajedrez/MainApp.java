package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	private static Reina reina;

	public static void main(String[] args) {
		MainApp.ejecutarOpcion(0);
	}

	private static void ejecutarOpcion(int opcion) {
		do {
			Consola.mostrarMenu();
			System.out.println("5º Opcion: Mostrar Reina. ");
			opcion = Consola.elegirOpcionMenu();
			switch (opcion) {
			case 1:
				crearReinaDefecto();
				mostrarReina();
				break;
			case 2:
				crearReinaColor();
				mostrarReina();
				break;
			case 3:
				mover();
				mostrarReina();
				break;
			case 4:
				Consola.despedirse();
				break;
			case 5:
				mostrarReina();
				break;
			}
		} while (opcion != 4);

	}

	private static void crearReinaDefecto() {
		reina = new Reina();
	}

	private static void crearReinaColor() {
		reina = new Reina(Consola.elegirColor());
	}

	private static void mover() {
		if (reina == null) {
			System.out.println("");
		} else {
			reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
		}
	}

	private static void mostrarReina() {
		if (reina == null) {
			System.out.println("Su reina aun no ha sido creada, necesita crearla para poder acceder a ella. ");
			System.out.println("");
			System.out.println("");
		} else {
			System.out.println(reina);
			System.out.println("");
			System.out.println("");
		}
	}
}
