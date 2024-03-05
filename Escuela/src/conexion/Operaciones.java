package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operaciones {
    
    private String[] valores;

    public void insertarEstudiante(String[] valores) {

        this.valores = valores;

        Conexion miConexion = new Conexion();
        Connection conexion = miConexion.getConexion();

        if (conexion != null) {  

            try{

                String query = "INSERT INTO estudiantes (nombre, apellido, edad, genero, direccion, telefono, correo, matricula, facultad, carrera, semestre, promedio, grupo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                
                try (PreparedStatement statement = conexion.prepareStatement(query)) {
                    
                    for (int i = 0; i < valores.length; i++) {

                        statement.setString(i + 1, valores[i]);

                    }
                    
                    int filasInsertadas = statement.executeUpdate();
                    
                    if (filasInsertadas > 0) {
                        System.out.println("Estudiante insertado correctamente.");
                    } else {
                        System.out.println("No se insertó ningún estudiante.");
                    }
                }

            }catch(SQLException e){
                
                System.out.println("Error al insetar datos: " + e.getMessage());
            
            }finally{

                try {

                    conexion.close();

                } catch (SQLException e) {

                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                
                }
            
            }

        }else{

            System.out.println("No se pudo establecer la conexión.");
        
        }

    }

    public void eliminarEstudiante(String matricula) {

        Conexion miConexion = new Conexion();
        Connection conexion = miConexion.getConexion();

        if (conexion != null) {  

            try{

                Statement statement = conexion.createStatement();
                String query = "DELETE FROM estudiantes WHERE matricula = '" + matricula + "'";
                boolean result = statement.execute(query);

                if (result) {

                    System.out.println("Estudiante eliminado correctamente");
                
                } else {

                    System.out.println("Error al eliminar el estudiante");
                
                }

            }catch(SQLException e){
                
                System.out.println("Error al eliminar datos: " + e.getMessage());
            
            }finally{

                try {

                    conexion.close();

                } catch (SQLException e) {

                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                
                }
            
            }

        }else{

            System.out.println("No se pudo establecer la conexión.");
        
        }

    }

    public void obtenerEstudiantes() {

        Conexion miConexion = new Conexion();
        Connection conexion = miConexion.getConexion();

        if (conexion != null) {
            try{
                Statement statement = conexion.createStatement();
                String query = "SELECT * FROM estudiantes";
                ResultSet result = statement.executeQuery(query);

                while (result.next()) {
                    System.out.println(result.getString("nombre") + " " + result.getString("apellido"));
                }

                result.close();
                statement.close();
                conexion.close();
            }catch(SQLException e){
                System.out.println("Error al ejecutar la consulta: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }

    }

}