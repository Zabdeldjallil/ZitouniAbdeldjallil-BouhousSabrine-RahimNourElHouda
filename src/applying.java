
class applying extends appabs {
public void apply(String type,Etudiant E) {
	if(type=="Standard") {
		E.setNbLivreMensuel_Autorise(10);
	}
	if(type=="Premium") {
		E.setNbLivreMensuel_Autorise(10*2);
	}
	if(type==null) {
		System.out.println("Type does not exist");
	}
}
}
