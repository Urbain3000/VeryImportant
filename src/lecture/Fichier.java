package lecture;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fichier {

	public static void main(String[] args) throws IOException {
	Path path=Paths.get("notes/METHODES4.txt");
	
	System.out.println(path.toRealPath);

	}

}
