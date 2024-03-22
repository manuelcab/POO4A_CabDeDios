import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ejecutor extends TareaPeriodica {

	private String comando;

	public Ejecutor(String comando, int periodo) {
		super(periodo);
		this.comando = comando;
	}

	public String leerComando() {
		return comando;
	}

	public boolean necesitaEjecucion() {
		if (!activa) {
			return false;
		}

		Calendar proximaEjecucion = new GregorianCalendar();
		proximaEjecucion.setTime(ultimaEjecucion);
		proximaEjecucion.add(Calendar.SECOND, periodo);

		Calendar ahora = new GregorianCalendar();
		return (proximaEjecucion.before(ahora));
	}

	@SuppressWarnings("deprecation")
	public int ejecutarTarea() {
		try {
			Runtime.getRuntime().exec(comando);
			return 0;
		} catch (IOException e) {
			System.err.println(e.toString());
		}
		return -1;
	}
}