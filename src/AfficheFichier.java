import java.io.FileWriter;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
class AfficheFichier implements IJournal{

	@Override
	public void outPut_Msg(String message) {
		// TODO Auto-generated method stub
		 try {
			 FileWriter myWriter = new FileWriter("filename.txt");
		     myWriter.write(message);
		     myWriter.close();
		     System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
