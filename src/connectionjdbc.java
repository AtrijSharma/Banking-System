import javax.swing.JOptionPane;
import java.sql.*;

public class connectionjdbc {
	Connection conn = null;
	
	public static Connection ConncrDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bank","root","admin");
			return conn;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			
			return null;
		}
	}

}
