public class Cliente {
    
    private String nombre;	// Nombre del cliente
    private String apellido;	// Apellido del cliente
    private String numeroCliente;	// Número del cliente

    public Cliente(String nombre, String apellido){	// Constructor de la clase

        this.nombre = nombre;	// Se asigna el nombre
        this.apellido = apellido;	// Se asigna el apellido
        numeroCliente = generarCliente();	// Se genera el número de cliente

    }

    public String getNombre(){	// Método para obtener el nombre

        return nombre;	// Regresa el nombre

    }

    public void setNombre(String nombre){	// Método para asignar el nombre

        this.nombre = nombre;	// Se asigna el nombre

    }

    public String getApellido(){	// Método para obtener el apellido

        return apellido;	// Regresa el apellido

    }

    public void setApellido(String apellido){	// Método para asignar el apellido

        this.apellido = apellido;	// Se asigna el apellido

    }

    public String getNumeroCliente(){	// Método para obtener el número de cliente

        return numeroCliente;	// Regresa el número de cliente

    }

    public String generarCliente(){	// Método para generar el número de cliente

        String numero = "";	// Se crea una variable de tipo String
        for(int i = 0; i < 10; i++){	// Ciclo para generar el número de cliente

            numero = numero + (int)(Math.random()*10);	// Se genera un número aleatorio y se concatena a la variable

        }

        return numero;	// Regresa el número de cliente
        
    }


}
