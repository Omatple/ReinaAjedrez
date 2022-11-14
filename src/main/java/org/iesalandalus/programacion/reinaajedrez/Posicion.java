package org.iesalandalus.programacion.reinaajedrez;

public class Posicion {
	private int fila;
	private char columna;

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		if (fila < 1) {
			throw new IllegalArgumentException("Esta casilla no existe, ni ninguna por debajo de la casilla 1. ");
		} else if (fila > 8) {
			throw new IllegalArgumentException("Esta casilla no existe, ni ninguna por encima de la casilla 8. ");
		}
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		char a = 1;
		char h = 8;
		if (columna < a) {
			throw new IllegalArgumentException("Esta casilla no existe, ni ninguna por debajo de la casilla a. ");
		} else if (columna > h) {
			throw new IllegalArgumentException("Esta casilla no existe, ni ninguna por encima de la casilla h. ");
		}
		this.columna = columna;
	}
}
