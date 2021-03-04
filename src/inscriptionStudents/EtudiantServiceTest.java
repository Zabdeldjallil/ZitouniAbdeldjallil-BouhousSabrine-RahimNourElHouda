package inscriptionStudents;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
public class EtudiantServiceTest {
	@Test
	void test() throws SQLException {
		EtudiantService serv=new EtudiantService();
		boolean p= serv.inscription(55565, "qsdqsd", "wasssqssila", "guesssn@gmail.com","xxxx", 2);
		
		assertEquals(true,p);
	}
}
