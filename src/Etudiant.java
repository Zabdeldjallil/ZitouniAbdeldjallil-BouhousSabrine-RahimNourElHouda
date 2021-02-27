import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Etudiant {

		private int matricule;
	    private String nom;
	    private String prenom;
	    private String email ;
	    private String pwd;
	    private int nbLivreMensuel_Autorise;
	    private int nbLivreEmprunte;
	    private int id_universite;
	    
	   
		public Etudiant(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
			
			this.matricule = matricule;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.pwd = pwd;
			this.id_universite = id_universite;
		}


		public int getMatricule() {
			return matricule;
		}


		public void setMatricule(int matricule) {
			this.matricule = matricule;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getPrenom() {
			return prenom;
		}


		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public int getNbLivreMensuel_Autorise() {
			return nbLivreMensuel_Autorise;
		}


		public void setNbLivreMensuel_Autorise(int nbLivreMensuel_Autorise) {
			this.nbLivreMensuel_Autorise = nbLivreMensuel_Autorise;
		}
		public void addNbLivreMensuel_Autorise() throws SQLException {
			 Connection connect=DBConnection.getConn();
	            Statement stmt = connect.createStatement();
	            int Nbr_L_M=this.getNbLivreMensuel_Autorise();
	            if(Nbr_L_M != 0) {
	                int Id_Un=this.getId_universite();
	            String sql = "select TypePackage from etudiant where id_universite="+ Id_Un;
	            ResultSet rs = stmt.executeQuery(sql);
	            rs.next();
	                if(rs.getString(0)=="Standard") {
	                    this.nbLivreMensuel_Autorise+=5;
	                }else if(rs.getString(0)=="Premium") {
	                    this.nbLivreMensuel_Autorise+=10;

	                }else{
	                System.out.print("Failed successfully");
	            }

	            }else {
	                System.out.print("Le forfait de cet etudiant est illimité ");
	            }
			/*int id=this.getId_universite();
			Connection connect=DBConnection.getConn();
			
			Statement stmt = connect.createStatement();
			String sql = "select TypePackage from universite where id_universite="+ id;
			ResultSet rs = stmt.executeQuery(sql);;
			rs.next();
			
				if(rs.getString(0)=="Standard") this.nbLivreMensuel_Autorise+=5;
				else {
					if(rs.getString(0)=="Premium"){
						this.nbLivreMensuel_Autorise+=10;
					}else {
						System.out.println("Failed successfully");
					}
				} */
		}

		public int getNbLivreEmprunte() {
			return nbLivreEmprunte;
		}


		public void setNbLivreEmprunte(int nbLivreEmprunte) {
			this.nbLivreEmprunte = nbLivreEmprunte;
		}


		public int getId_universite() {
			return id_universite;
		}


		public void setId_universite(int id_universite) {
			this.id_universite = id_universite;
		}


		public String getPwd() {
			return pwd;
		}


		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		
		
	    }
