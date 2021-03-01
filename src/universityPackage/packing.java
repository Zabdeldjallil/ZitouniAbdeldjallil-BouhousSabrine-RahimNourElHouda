package universityPackage;

public class packing extends packabs{
public String veriftype(Universite univ) {
	if (univ.getPack() == TypePackage.Standard)
    {
		return "Standard";
		//E.setNbLivreMensuel_Autorise(10);
    }else {
    	if (univ.getPack() == TypePackage.Premium)
	     {
    		return "Permium";
    	//	E.setNbLivreMensuel_Autorise(10*2);
	     } 
    }
	return null;
	
}
}
