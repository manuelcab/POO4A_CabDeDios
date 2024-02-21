public class Cuenta{

	private String numeroCuenta;	// Número de cuenta
	private double saldo;	// Saldo de la cuenta
	private String numeroCliente;	// numero del cliente

	public Cuenta(String numeroCliente){	// Constructor de la clase

		this.numeroCliente = numeroCliente;	// Se asigna el número de cliente
		numeroCuenta = generarCuenta();	// Se genera el número de cuenta
		saldo = 0;	// Se inicializa el saldo en 0

	}

	public String getNumeroCuenta(){	// Método para obtener el número de cuenta

		return numeroCuenta;	// Regresa el número de cuenta

	}

	public double consultar(){	//Metodo para consultar el saldo

		return saldo;	// Regresa el saldo

	}

	public void depositar(double cantidad){	// Método para depositar

		if(cantidad > 0){	// Si la cantidad es mayor a 0

			saldo = saldo + cantidad;	// Se suma la cantidad al saldo

		}else{	// Si la cantidad es menor o igual a 0

			System.out.println("Cantidad Invalida");	// Se imprime un mensaje

		}

	}

	public void retirar(double cantidad){	// Método para retirar

		if(cantidad > 0){	// Si la cantidad es mayor a 0

			if(cantidad <= saldo){	// Si la cantidad es menor o igual al saldo

				saldo = saldo - cantidad;	// Se resta la cantidad al saldo

			}else{	// Si la cantidad es mayor al saldo

				System.out.println("Saldo Insuficiente");	// Se imprime un mensaje

			}

		}else{	// Si la cantidad es menor o igual a 0

			System.out.println("Cantidad Invalida");	// Se imprime un mensaje

		}

	}

	public void transferir(double cantidad, Cuenta cuenta){	// Método para transferir

		if(cantidad > 0){	// Si la cantidad es mayor a 0

			if(cantidad <= saldo){	// Si la cantidad es menor o igual al saldo

				saldo = saldo - cantidad;	// Se resta la cantidad al saldo
				cuenta.depositar(cantidad);	// Se deposita la cantidad en la cuenta destino

			}else{	// Si la cantidad es mayor al saldo

				System.out.println("Saldo Insuficiente");	// Se imprime un mensaje

			}

		}else{	// Si la cantidad es menor o igual a 0

			System.out.println("Cantidad Invalida");	// Se imprime un mensaje

		}

	}

	public String generarCuenta(){	// Método para generar el número de cuenta

		String numero = "";	// Se crea una variable de tipo String
		for(int i = 0; i < 16; i++){	// Ciclo para generar el número de cuenta

			numero = numero + (int)(Math.random()*10);	// Se genera un número aleatorio y se concatena a la variable

		}

		return numero;	// Regresa el número de cuenta
		
	}

}