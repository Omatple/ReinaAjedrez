package org.iesalandalus.programacion.reinaajedrez;

public enum Color {
	BLANCO, NEGRO;

	String cadenaAMostrar;

	public void CadenaAMostrar() {
		this.cadenaAMostrar = cadenaAMostrar;
	}

	@Override
	public String toString() {
		return "Cadena -> " + cadenaAMostrar;
	}
}