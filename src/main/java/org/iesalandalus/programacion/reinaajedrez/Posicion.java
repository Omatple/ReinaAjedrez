package org.iesalandalus.programacion.reinaajedrez;

import java.util.Objects;

import javax.naming.OperationNotSupportedException;

public class Posicion {
	private int fila;
	private char columna;

	public void Posicion(int fila, char columna) throws OperationNotSupportedException {
		try {
			setFila(fila);
			setColumna(columna);
		} catch (IllegalArgumentException e) {
			throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
		}
	}

	public Posicion(Posicion posicion) {
		this.fila = posicion.getFila();
		this.columna = posicion.getColumna();
	}

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
		if (columna < 1) {
			throw new IllegalArgumentException("Esta casilla no existe, ni ninguna por debajo de la casilla a. ");
		} else if (columna > 8) {
			throw new IllegalArgumentException("Esta casilla no existe, ni ninguna por encima de la casilla h. ");
		}
		this.columna = columna;
	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return "Fila = " + fila + ", Columna = " + columna;
	}
}
