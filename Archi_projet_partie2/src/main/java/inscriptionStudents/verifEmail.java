package inscriptionStudents;
import java.sql.SQLException;

import etudiantPackage.EtudiantRepository;
import universityPackage.UniversiteRepository;

class verifEmail {
public boolean verifmail(String email,int matricule) throws SQLException {
	EtudiantRepository StudRep= new EtudiantRepository(); 
	UniversiteRepository UnivRep= new UniversiteRepository();
	if(email == null || email.length() == 0)
	    {
		System.out.println("faregh");
	    	return false;
	    }
	if (StudRep.Exists(matricule)==true)
		    {
		System.out.println("kayen matricule");
		        return false;
		        
		    }
	if (StudRep.Exists(email)==true)
    {
		System.out.println("kayen email");
        return false;
    }
	return true;
}
}
