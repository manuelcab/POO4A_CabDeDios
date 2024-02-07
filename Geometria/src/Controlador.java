package src;

import src.Geometria;

public class Controlador{
	
	public static void main(String[] args) {
		
		Geometria cuadrado = new Geometria(10.0f);
		Geometria rectangulo = new Geometria(5.0f, 8.0f);
		Geometria triangulo = new Geometria(6.0f, 4.0f);

		System.out.println("Perimetro del cuadrado: " + cuadrado.calcularPerimetroCuadrado());

		System.out.println("Operaciones: " + cuadrado.getContadorOperaciones());

		System.out.println("Area del cuadrado: " + cuadrado.calcularAreaCuadrado());

		System.out.println("Operaciones: " + cuadrado.getContadorOperaciones());

		System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetroRectangulo());

		System.out.println("Operaciones: " + cuadrado.getContadorOperaciones());

		System.out.println("Area del rectangulo: " + rectangulo.calcularAreaRectangulo());

		System.out.println("Operaciones: " + cuadrado.getContadorOperaciones());

		System.out.println("Area del triangulo: " + triangulo.calcularAreaTriangulo());

		System.out.println("Operaciones: " + cuadrado.getContadorOperaciones());

	}
	
}