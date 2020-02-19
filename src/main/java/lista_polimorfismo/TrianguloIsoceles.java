package lista_polimorfismo;

public class TrianguloIsoceles extends Triangulo{

	private int base;
	private int altura;
	


	public TrianguloIsoceles(String nome, int base, int altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}


	@Override
	public double CalcularPerimetro() {
		return this.getBase() + this.getAltura() + Math.hypot(getBase(), getAltura());
	}

	@Override
	public double CalcularArea() {
		return (this.getBase() * this.getAltura()) / 2;
		}

}
