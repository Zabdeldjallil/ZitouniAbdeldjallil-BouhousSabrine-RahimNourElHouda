package inscriptionStudents;

class ControleurInscription {
public void control(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
	System.out.println(matricule + nom + prenom+email+pwd+id_universite);
	EtudiantService serv=new EtudiantService();
	
	try {
		serv.inscription(matricule, nom, prenom, email,pwd, id_universite);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
