import java.io.File;
import java.io.IOException;
public class main {
	public static void main(String[] args) throws IOException {

		File folder = new File("E://Music//downloaded music//Chance The Rapper - Coloring Book//");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isFile()) {
System.out.println(listOfFiles[i].getName());
				//File f = new File("c:\\Projects\\sample\\"+listOfFiles[i].getName()); 

				//f.renameTo(new File("c:\\Projects\\sample\\"+i+".txt"));
			}
		}
		//System.out.println("conversion is done");
	}
}
