import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    Connection Rconector = null;

    public Connection conectar() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Rconector = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/carniceria_db",
                    "root",
                    ""
            );

        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null,
                    "Error de conexión: " + e.getMessage());

        }

        return Rconector;
    }
}