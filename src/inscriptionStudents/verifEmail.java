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
	    	return false;
	    }
	if (StudRep.Exists(matricule))
		    {
		        return false;
		    }
	if (StudRep.Exists(email))
    {
        return false;
    }
	else return true;
}
}
