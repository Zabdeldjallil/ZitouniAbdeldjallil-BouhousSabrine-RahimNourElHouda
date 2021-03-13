package etudiantPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import affichagePackage.AffichageEcran;
import affichagePackage.AfficheDifferent;
import affichagePackage.AfficheFichier;
import affichagePackage.AfficheplusInfo;
import connexionBD.DBConnection;

public class EtudiantRepository {
	
	
	public void add(Etudiant E) throws SQLException
	{
		AfficheDifferent obj=new AfficheDifferent();
		//DBConnection BD= DBConnection.getConn();
		//Connection connect=BD.conn;
		Connection connect=DBConnection.getConn();
		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			AffichageEcran P=new AffichageEcran();
			AfficheFichier F=new AfficheFichier();
			AfficheplusInfo A=new AfficheplusInfo();
			obj.add(P);
			obj.add(F);
			obj.add(A);
			
			obj.outPut_Msg("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());	
			//System.out.println("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				obj.outPut_Msg("log : Echec de l'ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());	
				//System.out.println("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
			}
		//connect.close();
	 }


	public boolean Exists(String email) throws SQLException	
	{
		AfficheDifferent obj=new AfficheDifferent();
		Connection connect=DBConnection.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='" +email+"'";
		ResultSet rs = stmt.executeQuery(sql);
        boolean next=rs.next();
		if (next==true){
			obj.outPut_Msg("logBD--- :email existe dans la BD  " + email);
			//System.out.println("logBD--- :email existe dans la BD  " + email);
			//connect.close();
			return true;
			}
		obj.outPut_Msg("logBD--- :email n'existe dans la BD  " + email);
		//System.out.println("logBD--- : email n'existe pas " + email);	
		//connect.close();
		return false;
	}
	
	public boolean Exists(int mat) throws SQLException	
	{
		AfficheDifferent obj=new AfficheDifferent();
		Connection connect=DBConnection.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		//boolean rs = stmt.execute(sql);
		ResultSet rs = stmt.executeQuery(sql);
        boolean next=rs.next();
        if(next==true) {
        	
        	System.out.println("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
        	return true;
        }

		//System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		AffichageEcran P=new AffichageEcran();
		AfficheFichier F=new AfficheFichier();
		AfficheplusInfo A=new AfficheplusInfo();
		obj.add(P);
		obj.add(F);
		obj.add(A);
		obj.outPut_Msg("ogBD----: etudiant avec ce matricule n'existe pas"+mat);
		//connect.close();
		return false;
	}

}
