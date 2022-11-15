package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

public class Reina {
	private Color color;
	private Posicion posicion;

	public Reina() throws OperationNotSupportedException {
		color = Color.BLANCO;
		posicion = new Posicion(1, 'd');
	}

	public Reina(Color color) throws OperationNotSupportedException {
		this();
		setColor(color);
		if (color == Color.NEGRO) {
			posicion = new Posicion(8, 'd');
		} else if (color == Color.BLANCO) {
			posicion = new Posicion(1, 'd');
		}
	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		this.posicion = new Posicion(posicion);
	}

	@Override
	public String toString() {
		return "Posicion => " + posicion + ", Color = " + color;
	}
}
