import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MainAppMvc {

	public static void main(String[] args) throws SQLException {
		Connection connect=DBConnection.getConn();
    	Statement stmt = connect.createStatement();
		// TODO Auto-generated method stub
        Etudiant stdnt = new Etudiant(1,"chergui","ahmed","ahmedch@gmail.com","0000",2);
        EtudiantRepository StudReposit= new EtudiantRepository();
        Universite university= new Universite(1,"Alger1",TypePackage.Standard);
	    UniversiteRepository UnivReposit= new UniversiteRepository(); 
	    
        ViewInscription view =new ViewInscription();
		view.create();
	}

}