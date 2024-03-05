package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String host = "localhost";
    private static final String name = "escuela";
    private static final String user = "root";
    private static final String password = "root";

    private Connection conexion;

    public Conexion() {
        try {
            String url = "jdbc:mysql://" + host + "/" + name;
            conexion = DriverManager.getConnection(url, user, password);
            if (conexion != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Connection getConexion() {
        return conexion;
    }
}