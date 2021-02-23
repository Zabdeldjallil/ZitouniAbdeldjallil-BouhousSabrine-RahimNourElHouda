import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    public Connection conn;
	    public static DBConnection DB;
	   
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}
	    public static synchronized DBConnection getConn() {
	    	if(DB==null) {
	    		try {
					 DB=new DBConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    	System.out.println("Creation of a new connection...");
	    	
	    	return DB;
		}


		
	
}
