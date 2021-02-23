
public class AfficheDifferent implements IJournal{

	@Override
	public void outPut_Msg(String message) {
		// TODO Auto-generated method stub
		 AffichageEcran AE=new AffichageEcran();
		 AfficheFichier AF=new AfficheFichier();
		 AfficheplusInfo API=new AfficheplusInfo(); 
		AE.outPut_Msg(message);
		AF.outPut_Msg(message);
		API.outPut_Msg(message);
		    
	}

}
