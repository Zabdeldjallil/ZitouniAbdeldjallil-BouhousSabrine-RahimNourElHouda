import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class DBConnection {
	   
		String BDD = "nomDB";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "12011999";
	    public static Connection conn;
	    //public static DBConnection DB;
	   
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}
	    public static synchronized Connection getConn() {
	    	if(conn==null) {
	    		try {
					 DBConnection db=  new DBConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					e.printStackTrace();
				}
	    	}
	    	System.out.println("Creation of a new connection...");
	    	
	    	return conn;
		}


		
	
}
