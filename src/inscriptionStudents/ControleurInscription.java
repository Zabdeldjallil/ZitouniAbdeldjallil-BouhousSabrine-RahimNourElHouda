package inscriptionStudents;

class ControleurInscription {
public void control(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
	System.out.println(matricule + nom + prenom+email+pwd+id_universite);
	EtudiantService serv=new EtudiantService();
	
	try {
		serv.inscription(matricule, nom, prenom, email,pwd, id_universite);
		System.out.println("done");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("failed to add");
		e.printStackTrace();
	}
}
}
