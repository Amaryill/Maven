package connectMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfigurationSol2 {
	
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost/laposte";
    private static final String USER = "Critical";
    private static final String MDP = "Lco950921";
    
	
	static Connection connection = null;
    public static Connection getConnection(){
        try {
			Class.forName(DB_DRIVER);
            if(connection == null) {
                connection = DriverManager.getConnection(DB_CONNECTION,USER,MDP);
            }
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
            e1.printStackTrace();
        }
        return connection;
    }
    
}
