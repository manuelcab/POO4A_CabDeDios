public class Test {

    public static void main(String[] args) {

        new Thread(new Reloj()).start();
        new Thread(new Ejecutor("calc", 0)).start();

    }

}