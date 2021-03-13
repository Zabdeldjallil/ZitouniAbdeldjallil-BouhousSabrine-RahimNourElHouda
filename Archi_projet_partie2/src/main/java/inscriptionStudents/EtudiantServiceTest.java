package inscriptionStudents;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.sql.SQLException;
public class EtudiantServiceTest {
	
	void test() throws SQLException {
		EtudiantService serv=new EtudiantService();
		boolean p= serv.inscription(null, null, 55565, "qsdqsd", "wasssqssila", "guesssn@gmail.com","xxxx", 2);
		
		assertEquals(true,p);
	}
}
