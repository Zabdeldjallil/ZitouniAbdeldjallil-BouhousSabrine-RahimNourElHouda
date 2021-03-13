package mainProjet;
import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import etudiantPackage.Etudiant;
import etudiantPackage.EtudiantRepository;
import inscriptionStudents.EtudiantService;
import inscriptionStudents.ViewInscription;
import universityPackage.UniversiteRepository;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ViewInscription view =new ViewInscription();
		//view.create();
		
		
	EtudiantService serv=new EtudiantService();
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	EtudiantRepository  etudiantRep = (EtudiantRepository) context.getBean("etdRepository");
	UniversiteRepository  uniRep = (UniversiteRepository) context.getBean("uniRepository");
	
	
	
	try {
			serv.inscription(etudiantRep,uniRep,51, "Guendouziiiii", "wassila", "guendd0@gmail.com","xxxx", 2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
