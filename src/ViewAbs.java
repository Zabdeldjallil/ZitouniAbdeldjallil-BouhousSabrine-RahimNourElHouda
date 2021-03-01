
public abstract class ViewAbs {
	public abstract void create(); 
	public void control(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
		ControleurInscription controling=new ControleurInscription();
		controling.control(matricule ,nom,prenom,email,pwd,id_universite );
	}
	
}
