package lista_polimorfismo;

import java.lang.Math;

public class TrianguloEquilatero extends Triangulo {

	private double lado;
	

	public TrianguloEquilatero(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double CalcularPerimetro() {
		return this.getLado() * 3;
	}

	@Override
	public double CalcularArea() {
		return (Math.pow(getLado(), 2)/ 4) * Math.sqrt(3);
	}

}
