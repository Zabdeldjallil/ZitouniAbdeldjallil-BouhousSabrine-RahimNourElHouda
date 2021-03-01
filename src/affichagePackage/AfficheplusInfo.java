package affichagePackage;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
public class AfficheplusInfo extends AffichageEcran {

	@Override
	public void outPut_Msg(String message) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(message+" "+dtf.format(now)+"Generated from AfficheplusInfo class");  
	}

}
