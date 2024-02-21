import java.util.ArrayList; // Importamos la clase ArrayList

public class Departamento { 

    private String nombreDepartamento;  // Variable para el nombre del departamento
    private ArrayList<String> empleados;    // Variable para los empleados

    public Departamento(String nombreDepartamento) {    // Constructor para el departamento
        this.nombreDepartamento = nombreDepartamento;   // Establecemos el nombre del departamento
        this.empleados = new ArrayList<>(); // Inicializamos la lista de empleados
    }

    public ArrayList<String> getEmpleados() {   // Metodo para obtener los empleados
        return empleados;   // Regresamos los empleados
    }

    public String getNombreDepartamento() { // Metodo para obtener el nombre del departamento
        return nombreDepartamento;  // Regresamos el nombre del departamento
    }

    public void setEmpleados(ArrayList<String> empleados) {   // Metodo para establecer los empleados
        this.empleados = empleados; // Establecemos los empleados
    }

    public void addEmpleado(String empleado) {  // Metodo para agregar un empleado
        empleados.add(empleado);    // Agregamos el empleado
    }
}
