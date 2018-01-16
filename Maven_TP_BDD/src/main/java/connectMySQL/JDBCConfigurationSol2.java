package connectMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfigurationSol2 {
	 
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";

	private static final String DB_CONNECTION = "jdbc:mysql://localhost/laposte?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String MDP = "";
    
	
	static Connection connection = null;
	
    public static Connection getConnection(){
        try {
			Class.forName(DB_DRIVER);
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
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
