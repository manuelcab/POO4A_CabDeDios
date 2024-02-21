import java.util.ArrayList;
import java.util.List;

public class Cuenta{

	private double saldo;
        private List<String> movimientos;

	public Cuenta(double saldoInicial){
		this.saldo = saldoInicial;
                this.movimientos = new ArrayList<>();
	}

	public double getSaldo(){
		return saldo;
	}

	public void depositar(double cantidad){
		this.saldo += cantidad;
                this.movimientos.add("Deposito: + $" + cantidad);
	}

	public void retirar(double cantidad){
		if(cantidad <= this.saldo){
			this.saldo -= cantidad;
                        this.movimientos.add("Retiro: - $" + cantidad);
		}else{
			System.out.println("Saldo Insuficiente");
		}
	}
        
        public List<String> getMovimientos() {
            return movimientos;
        }
        
}