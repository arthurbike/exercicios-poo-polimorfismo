package lista_polimorfismo;

public class Quadrado extends Mae {

	private double lado = 0;
	
	public Quadrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
		// TODO Auto-generated constructor stub
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double CalcularPerimetro() {
		return this.lado * 4;
	}

	@Override
	public double CalcularArea() {
		return this.getLado() * this.getLado();
	}

}
