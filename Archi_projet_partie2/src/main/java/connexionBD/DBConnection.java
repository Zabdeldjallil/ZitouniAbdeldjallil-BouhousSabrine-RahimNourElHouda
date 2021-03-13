package connexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import affichagePackage.AffichageEcran;
import affichagePackage.AfficheDifferent;
import affichagePackage.AfficheFichier;
import affichagePackage.AfficheplusInfo;

public  class DBConnection {
	   
		String BDD = "nomDB";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
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
	    	//System.out.println("Creation of a new connection...");
	    	AfficheDifferent obj=new AfficheDifferent();
	    	AffichageEcran P=new AffichageEcran();
			AfficheFichier F=new AfficheFichier();
			AfficheplusInfo A=new AfficheplusInfo();
			obj.add(P);
			obj.add(F);
			obj.add(A);
			obj.outPut_Msg("toto");
	    	return conn;
		}


		
	
}
