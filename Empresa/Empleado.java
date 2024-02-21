public class Empleado {

    private String nombreEmpleado;  // Variable para el nombre
    private String numeroEmpleado;  // Variable para el numero
    private String salarioEmpleado; // Variable para el salario
    private Departamento departamento;  // Variable para el departamento

    public String getNombreEmpleado() { // Metodo para obtener el nombre
        return nombreEmpleado;  // Regresa el nombre
    }

    public String getNumeroEmpleado() { // Metodo para obtener el numero
        return numeroEmpleado;  // Regresa el numero
    }

    public String getSalarioEmpleado() {    // Metodo para obtener el salario
        return salarioEmpleado; // Regresa el salario
    }
    
    public Departamento getDepartamento() {   // Metodo para obtener el departamento
        return departamento;    // Regresa el departamento
    }

    public String getInformacion(){ // Metodo para obtener la informacion
        return "\nNombre: " + nombreEmpleado + "\nNumero: " + numeroEmpleado + "\nSalario: " 
        + salarioEmpleado + "\nDepartamento: " + departamento.getNombreDepartamento();  // Regresa la informacion
    }

    public void setNombreEmpleado(String nombreEmpleado) {  // Metodo para establecer el nombre
        this.nombreEmpleado = nombreEmpleado;   // Establece el nombre
    }

    public void setNumeroEmpleado(String numeroEmpleado) {  // Metodo para establecer el numero
        this.numeroEmpleado = numeroEmpleado;   // Establece el numero
    }

    public void setSalarioEmpleado(String salarioEmpleado) {    // Metodo para establecer el salario
        this.salarioEmpleado = salarioEmpleado; // Establece el salario
    }

    public void setDepartamento(Departamento departamento) {    // Metodo para establecer el departamento
        this.departamento = departamento;   // Establece el departamento
    }
}