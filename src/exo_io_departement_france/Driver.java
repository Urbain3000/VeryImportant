package exo_io_departement_france;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	static ArrayList<Ville> listeDeVille = new ArrayList<>();
	
	public static void main(String[] args) {

		try {
			
			// parcourrir le fichier villes_france.csv
			File myFile = new File("C:\\Users\\admin\\eclipse-workspace\\VeryImportant\\src\\exo_io_departement_france\\villes_france.csv\\");
			
			Scanner myFileReader;
			myFileReader = new Scanner(myFile);
			
			
			// parcourrir les ligne du fichier villes_france.csv
			while (myFileReader.hasNextLine()) {
				String data = myFileReader.nextLine();
				//System.out.println(data);
				creerVille(data);
				
				
//				extraireDepartement(numeroDepartement, lignesVilles);

			}
			myFileReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
//		System.out.println(listeDeVille.size());
//		extraireDepartement("59", "only for test");
		
	}
	
	public static void creerVille(String s) {
		
		String infoVilles [] = s.split(",");
		
//		for (int i=0; i<infoVilles.length; i++) {
//			System.out.println(infoVilles[i]);
//		}	
//		System.out.println("********************* fin *****************");
		
		Ville ville = new Ville(
				infoVilles [0],
				infoVilles [1],
				infoVilles [2],
				infoVilles [3],
				infoVilles [4],
				infoVilles [5],
				infoVilles [6],
				infoVilles [7],
				infoVilles [8],
				infoVilles [9],
				infoVilles [10],
				infoVilles [11],
				infoVilles [12],
				infoVilles [13],
				infoVilles [14],
				infoVilles [15],
				infoVilles [16],
				infoVilles [17],
				infoVilles [18],
				infoVilles [19],
				infoVilles [20],
				infoVilles [21],
				infoVilles [22],
				infoVilles [23],
				infoVilles [24],
				infoVilles [25],
				infoVilles [26]
				);
		listeDeVille.add(ville);
		
	}
	
	public static void extraireDepartement(String numeroDepartement, String lignesVilles) {
		try {
			String emplacement = "C:\\Users\\admin\\eclipse-workspace\\VeryImportant\\src\\exo_io_departement_france\\out\\";
			String extension = ".csv";
			File myExtractedFile = new File(emplacement + "dep_" + numeroDepartement + extension);
			myExtractedFile.createNewFile();
			
			FileWriter myWriter = new FileWriter(emplacement + "dep_" + numeroDepartement + extension);
		    myWriter.write(lignesVilles);
		    myWriter.close();
		      
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
