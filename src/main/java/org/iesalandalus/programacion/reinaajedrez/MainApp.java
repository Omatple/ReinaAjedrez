package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

public class MainApp {
	
	public static void main(String[] args) throws OperationNotSupportedException {
		Reina reina1 = new Reina();
		System.out.println(reina1);
		Reina reina2 = new Reina(Color.NEGRO);
		System.out.println(reina2);
	}
}
