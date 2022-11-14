package org.iesalandalus.programacion.reinaajedrez;

public enum Color {
	BLANCO, NEGRO;

	private String cadenaAMostrar;

	public Color(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}
	@Override
	public String toString() {
		return "Cadena -> " + cadenaAMostrar;
	}
}