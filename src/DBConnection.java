import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private static Connection conn;

	   
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}

	    
	    public static Connection getConn() {
	    	if(conn==null) {
	    		try {
					DBConnection DB=new DBConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    	return conn;
		}


		
	
}
