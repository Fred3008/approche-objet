package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		

		Path path = Paths.get("/Library/Tamp/recensement.csv");
		List<String> villes = Files.readAllLines(path);
		
		

		
		
		
		for (String line : villes) {
			System.out.println(line);
		}
	}

}
