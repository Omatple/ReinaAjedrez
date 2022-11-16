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

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (pasos < 1) {
			throw new IllegalArgumentException(
					"Los pasos con los que te mueves no pueden ser inferiores a 1 ya que si es 0 no te moverias y no puede ser un numero negativo porque para ello existen todas las direcciones en la que se puede mover la pieza. ");
		} else if (pasos > 7) {
			throw new IllegalArgumentException(
					"Los pasos con los que te mueves no pueden ser superiores a 7 ya que en todas las posibilidades de este movimiento superior a 7 pasos la pieza se saldria del tablero y esto no esta permitido.");
		} else if (direccion == null) {
			throw new NullPointerException("La direccion asignada no puede ser nula. ");
		}
		if (direccion == Direccion.NORTE) {
			posicion = new Posicion(posicion.getFila() + pasos, posicion.getColumna());
		} else if (direccion == Direccion.SUR) {
			posicion = new Posicion(posicion.getFila() - pasos, posicion.getColumna());
		} else if (direccion == Direccion.ESTE) {
			posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() + (char) pasos));
		} else if (direccion == Direccion.OESTE) {
			posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() - (char) pasos));
		} else if (direccion == Direccion.NORESTE) {
			posicion = new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() + (char) pasos));
		} else if (direccion == Direccion.NOROESTE) {
			posicion = new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() - (char) pasos));
		} else if (direccion == Direccion.SURESTE) {
			posicion = new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() + (char) pasos));
		} else if (direccion == Direccion.SUROESTE) {
			posicion = new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() - (char) pasos));
		}
	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		this.color = color;
	}

	public Posicion getPosicion() {
		return new Posicion(posicion);
	}

	private void setPosicion(Posicion posicion) {
		this.posicion = new Posicion(posicion);
	}

	@Override
	public String toString() {
		return "Color = " + color + ", Posición => " + posicion;
	}
}
