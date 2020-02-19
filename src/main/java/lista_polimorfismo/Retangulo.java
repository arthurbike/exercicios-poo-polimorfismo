package lista_polimorfismo;

public class Retangulo extends Mae{

	private double ladoA;
	private double ladoB;
	
	
	public Retangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retangulo(String nome, double ladoA, double ladoB) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	@Override
	public double CalcularPerimetro() {
		return  (2 *this.getLadoA()) + (2 * this.getLadoB());
	}

	@Override
	public double CalcularArea() {
		return this.getLadoA() * this.getLadoB();
	}

}
