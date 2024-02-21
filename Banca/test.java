public class test {
 
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Manuel ", "Cab");	// Se crea un objeto de tipo Cliente
        Cliente cliente2 = new Cliente("Litzy ", "Salomon");    // Se crea un objeto de tipo Cliente
        
        Cuenta cuenta = new Cuenta(cliente.getNumeroCliente());	// Se crea un objeto de tipo Cuenta
        Cuenta cuenta2 = new Cuenta(cliente2.getNumeroCliente());   // Se crea un objeto de tipo Cuenta

        System.out.println("Nombre: " + cliente.getNombre() + cliente.getApellido());	// Se imprime el nombre del cliente
        System.out.println("Numero de cliente: " + cliente.getNumeroCliente()); //Se imprime el numero de cliente
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());	// Se imprime el número de cuenta
        System.out.println("Saldo: " + cuenta.consultar()); // Se consulta el saldo
        cuenta.depositar(300.0);    //Se realiza un deposito de 300
        System.out.println("Deposito: $200");   //Imprime el deposito
        System.out.println("Saldo: " + cuenta.consultar()); //Se consulta el saldo

        System.out.println("Nombre: " + cliente2.getNombre() + cliente2.getApellido());	// Se imprime el nombre del cliente
        System.out.println("Numero de cliente: " + cliente2.getNumeroCliente()); //Se imprime el numero de cliente
        System.out.println("Numero de cuenta: " + cuenta2.getNumeroCuenta());	// Se imprime el número de cuenta
        System.out.println("Saldo: " + cuenta2.consultar());    //Se consulta el saldo

        cuenta.transferir(100.0, cuenta2);  //Se realiza un transferencia de 100 a la cuenta 2
        System.out.println("Deposito: $100");   //Se imprime la cantidad transferida

        System.out.println("Saldo Litzy: $" + cuenta2.consultar()); //Se consulta el nuevo saldo de cuenta 2
        System.out.println("Saldo Manuel: $" + cuenta.consultar()); //Se consulta el nuevo saldo de cuenta


    }

}
