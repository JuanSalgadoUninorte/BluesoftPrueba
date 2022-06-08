
package backEnd;

import java.sql.*;
import javax.swing.JOptionPane;

public class connection {
    
    Connection connect = null;
    String url = "jdbc:postgresql://localhost/postgres";
    String user = "postgres";
    String password = "123456";
    PreparedStatement ps;
    ResultSet rs;

    public Connection connected() {
        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Error");
            JOptionPane.showMessageDialog(null, "Error al conectar " + e, " Error", JOptionPane.ERROR_MESSAGE);
        }
        return connect;
}
}