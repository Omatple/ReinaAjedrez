package org.iesalandalus.programacion.reinaajedrez;

public enum Color {
	BLANCO("BLANCO"), NEGRO("NEGRO");

	private String cadenaAMostrar;

	public Color(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}

	@Override
	public String toString() {
		return "cadenaAMostrar = " + cadenaAMostrar;
	}
}