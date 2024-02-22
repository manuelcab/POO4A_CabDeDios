public class Test {
    
    public static void main(String[] args) {    // Metodo principal
        
        Departamento soporte = new Departamento("Soporte Tecnico"); // Creamos un departamento
        Departamento ventas = new Departamento("Ventas");   // Creamos un departamento

        Empleado empleado1 = new Empleado();    // Creamos un empleado
        Empleado empleado2 = new Empleado();    // Creamos un empleado
        Empleado empleado3 = new Empleado();    // Creamos un empleado
        Empleado empleado4 = new Empleado();    // Creamos un empleado

        empleado1.setNombreEmpleado("Manuel Cab");  // Establecemos el nombre del empleado
        empleado1.setNumeroEmpleado("#0001");   // Establecemos el numero del empleado
        empleado1.setSalarioEmpleado("$15,000");    // Establecemos el salario del empleado
        empleado1.setDepartamento(soporte); // Establecemos el departamento del empleado

        soporte.addEmpleado(empleado1.getInformacion());    // Agregamos el empleado al departamento

        empleado2.setNombreEmpleado("LItzy Salomon");   // Establecemos el nombre del empleado
        empleado2.setNumeroEmpleado("#0002");   // Establecemos el numero del empleado
        empleado2.setSalarioEmpleado("$15,000");    // Establecemos el salario del empleado
        empleado2.setDepartamento(soporte); // Establecemos el departamento del empleado

        soporte.addEmpleado(empleado2.getInformacion());    // Agregamos el empleado al departamento

        empleado3.setNombreEmpleado("Jorge Vargas");    // Establecemos el nombre del empleado
        empleado3.setNumeroEmpleado("#0003");   // Establecemos el numero del empleado
        empleado3.setSalarioEmpleado("$10,000");    // Establecemos el salario del empleado
        empleado3.setDepartamento(ventas);  // Establecemos el departamento del empleado

        ventas.addEmpleado(empleado3.getInformacion());    // Agregamos el empleado al departamento

        empleado4.setNombreEmpleado("Ana Torres");  // Establecemos el nombre del empleado
        empleado4.setNumeroEmpleado("#0004");   // Establecemos el numero del empleado
        empleado4.setSalarioEmpleado("$10,000");    // Establecemos el salario del empleado
        empleado4.setDepartamento(ventas);  // Establecemos el departamento del empleado

        ventas.addEmpleado(empleado4.getInformacion());    // Agregamos el empleado al departamento

        System.out.println(soporte.getEmpleados()); // Imprimimos los empleados del departamento
        System.out.println(ventas.getEmpleados());  // Imprimimos los empleados del departamento
    }

}