import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.awt.*;
import java.util.Arrays;
public class AfficheDifferent extends AffichageEcran{
	public List<IJournal> children = new ArrayList<>();
	public void add(IJournal component) {
        children.add(component);
    }
	@Override
	public void outPut_Msg(String message) {
		// TODO Auto-generated method stub
		//System.out.println("sokoksqd");
		//System.out.println(children.size());
		for(int i=0; i<children.size(); i++) {
			children.get(i).outPut_Msg(message);;
		}   
	}
}
