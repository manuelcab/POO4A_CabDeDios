package src;

public class Geometria{

	private static int contadorOperaciones = 0;

	private float ladoCuadrado;

	private float baseRectangulo;
	private float alturaRectangulo;

	private float baseTriangulo;
	private float alturaTriangulo;

	private float perimetroCuadrado;
	private float perimetroRectangulo;

	private float areaCuadrado;
	private float areaRectangulo;
	private float areaTriangulo;

	public static int getContadorOperaciones() {

        return contadorOperaciones;

    }

    public static void aumentarContador() {

        contadorOperaciones++;

    }

	public Geometria(float ladoCuadrado){

		this.ladoCuadrado = ladoCuadrado;

	}

	public Geometria(float base, float altura){

		this.baseRectangulo = base;
                this.baseTriangulo = base;
		this.alturaRectangulo = altura;
                this.alturaTriangulo = altura;

	}

	public float calcularPerimetroCuadrado(){

		perimetroCuadrado = ladoCuadrado + ladoCuadrado + ladoCuadrado + ladoCuadrado;

		aumentarContador();
		
		return perimetroCuadrado;

	}

	public float calcularPerimetroRectangulo(){

		perimetroRectangulo = baseRectangulo + alturaRectangulo + baseRectangulo + alturaRectangulo;

		aumentarContador();

		return perimetroRectangulo;

	}

	public float calcularAreaCuadrado(){

		areaCuadrado = ladoCuadrado * ladoCuadrado;

		aumentarContador();

		return areaCuadrado;

	}

	public float calcularAreaRectangulo(){

		areaRectangulo = baseRectangulo * alturaRectangulo;

		aumentarContador();

		return areaRectangulo;

	}

	public float calcularAreaTriangulo(){

		areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

		aumentarContador();

		return areaTriangulo;

	}
	
}