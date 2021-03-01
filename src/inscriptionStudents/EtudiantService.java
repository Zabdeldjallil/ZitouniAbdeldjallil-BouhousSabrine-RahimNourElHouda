package inscriptionStudents;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import connexionBD.DBConnection;
import etudiantPackage.*;
import universityPackage.*;
public class EtudiantService {
	
	
	boolean inscription (int matricule, String nom, String prenom, String email,String pwd, int id_universite) throws SQLException	
	{
		EtudiantRepository StudRep= new EtudiantRepository();
	    UniversiteRepository UnivRep= new UniversiteRepository();
	    Etudiant stud = new Etudiant(matricule, nom, prenom, email,pwd,id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    
	    System.out.println("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	
		verifEmail verification=new verifEmail();
		boolean b=verification.verifmail(email, matricule);
		if(b==false) return false;
		
		packing p=new packing();
		String a=p.veriftype(univ);
		
		AbsFactory abs=new AbsFactory();
		appabs ab=abs.getPlan(a);
		ab.apply(a, stud);
		
		//applying app=new applying();
		//app.apply(a, stud);
		 /*if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }    */                       
	     
		 StudRep.add(stud);
		 System.out.println("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
		 return true;
	}
	public void AjouterBonus(Etudiant E) throws SQLException {
        if(E.getNbLivreMensuel_Autorise()!= 0) {
        	Connection connect=DBConnection.getConn();
        	Statement stmt = connect.createStatement();
        	String sql = "select TypePackage from etudiant where id_universite="+ E.getId_universite();
        	ResultSet rs = stmt.executeQuery(sql);
        	rs.next();

       if(rs.getString(0) =="Standard") {
    	   E.setNbLivreMensuel_Autorise(E.getNbLivreEmprunte()+5);

    }else if(rs.getString(0) =="Premium") {
    	   E.setNbLivreMensuel_Autorise(E.getNbLivreEmprunte()+10);

    }
        }else {
            System.out.print("Le forfait de cet etudiant est illimité ");
        }
}
	
	

public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


	
}
