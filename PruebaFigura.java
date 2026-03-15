package Figuras.src.main.java.figuras;
import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {
	private static final Color RED = Color.red;
	private static int opcion;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		do {
			opcion = mostrarMenu();
			if (opcion != 4) {
				System.out.print("Introduzca la coordenada X del centro: ");
				double x = teclado.nextDouble();
				System.out.print("Introduzca la coordenada Y del centro: ");
				double y = teclado.nextDouble();
				switch (opcion) {
				case 1:
					triangulo(teclado, x, y);
					break;
				case 2:
					rectangulo(teclado, x, y);
					break;
				case 3:
					cuadrado(teclado, x, y);
					break;
				}
			}
		} while (opcion != 4);
		teclado.close();
	}

	private static void cuadrado(Scanner teclado, double x, double y) {
		System.out.print("Introduzca el lado del cuadrado: ");
		double lado = teclado.nextDouble();
		Cuadrado c = new Cuadrado(x, y, RED, lado);
		System.out.println("El perimetro es " + c.perimetro());
		System.out.println("El area es " + c.area());
	}

	private static void rectangulo(Scanner teclado, double x, double y) {
		System.out.print("Introduzca la base del rectangulo: ");
		double base = teclado.nextDouble();
		System.out.print("Introduzca la altura del rectangulo: ");
		double altura = teclado.nextDouble();
		Rectangulo r = new Rectangulo(x, y, RED, base, altura);
		System.out.println("El perimetro es " + r.perimetro());
		System.out.println("El area es " + r.area());
	}

	private static void triangulo(Scanner teclado, double x, double y) {
		System.out.print("Introduzca el lado 1 del triangulo: ");
		double lado1 = teclado.nextDouble();
		System.out.print("Introduzca el lado 2 del triangulo: ");
		double lado2 = teclado.nextDouble();
		System.out.print("Introduzca el lado 3 del triangulo: ");
		double lado3 = teclado.nextDouble();
		Triangulo t = new Triangulo(x, y, RED, lado1, lado2, lado3);
		System.out.println("El perimetro es " + t.perimetro());
		System.out.println("El area es " + t.area());
	}

	public static int mostrarMenu() {
		int opcion;
		System.out.println("1) Triangulo");
		System.out.println("2) Rectangulo");
		System.out.println("3) Cuadrado");
		System.out.println("4) Salir");
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Introduzca una opcion (1-4): ");
			opcion = teclado.nextInt();
			if (opcion < 1 || opcion > 4)
				System.out.println("Debe introducir un numero entre 1 y 4");
		} while (opcion < 1 || opcion > 4);
		return opcion;
	}
}