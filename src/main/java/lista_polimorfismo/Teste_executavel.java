package lista_polimorfismo;

import java.text.DecimalFormat;
import java.util.Random;

public class Teste_executavel {

	public static void main(String[] args) {
		Random valor = new Random();
		DecimalFormat df = new DecimalFormat("0.00");
		Mae[] formas = new Mae[7];

		for (int i = 0; i < formas.length; i++) {
			int tipo = valor.nextInt(7);
			switch (tipo) {
			case 0: {
				Quadrado quadrado = new Quadrado("Quadrado", (valor.nextInt(9) + 1));
				formas[i] = quadrado;
				break;
			}
			case 1: {
				Circulo circulo = new Circulo("Circulo", (valor.nextDouble()));
				formas[i] = circulo;
				break;

			}
			case 2: {
				Retangulo retangulo = new Retangulo("Quadrado", (valor.nextInt(9) + 1), (valor.nextInt(9) + 1));
				formas[i] = retangulo;
				break;

			}
			case 3: {
				Losangulo losango = new Losangulo("Losango", (valor.nextInt(9) + 1), (valor.nextInt(9) + 1),
						(valor.nextInt(9) + 1), (valor.nextInt(9) + 1));
				formas[i] = losango;
				break;
			}
			case 4: {
				TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo("Triangulo Retangulo",
						valor.nextDouble(), valor.nextDouble());
				formas[i] = trianguloRetangulo;
				break;
			}
			case 5: {
				TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero("Triangulo Equilatero",
						(valor.nextInt(9) + 1));
				formas[i] = trianguloEquilatero;
				break;
			}
			case 6: {
				TrianguloIsoceles trianguloIsosceles = new TrianguloIsoceles("Triangulo Isosceles",
						(valor.nextInt(9) + 1), (valor.nextInt(9) + 1));
				formas[i] = trianguloIsosceles;
				break;

			}

			}

		}
		for (int i = 0; i < formas.length; i++) {
            System.out.println("O nome da forma é: " + formas[i].getNome());
            System.out.println();
            System.out.println("A area é: " + df.format(formas[i].CalcularArea()));
            System.out.println();
            System.out.println("O perimetro é: " + df.format(formas[i].CalcularPerimetro()));
            System.out.println("--------------------------------------------------");


        }

	}
}
