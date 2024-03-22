import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Ejecutor e = new Ejecutor("calc", 1);
        Scanner leer = new Scanner(System.in);

        System.out.println("Escribe un commando para ejecutar");

        String comando = e.leerComando();
        comando = leer.next();

        if (e.necesitaEjecucion()) {

            e.ejecutarTarea();

        }
    }
    
}
